package com.example.messi.adapter

import android.content.DialogInterface.OnClickListener
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.messi.Games
import com.example.messi.R

class GamesAdapter(private val gameList:List<Games>, private val onClickListener:(Games) -> Unit) : RecyclerView.Adapter<GamesViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GamesViewHolder { //encargado de cojer los atributos
        val layoutInflater = LayoutInflater.from(parent.context)
        return GamesViewHolder(layoutInflater.inflate(R.layout.item_games, parent, false))
    }

    override fun onBindViewHolder(holder: GamesViewHolder, position: Int) {
        val item = gameList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = gameList.size
    }

