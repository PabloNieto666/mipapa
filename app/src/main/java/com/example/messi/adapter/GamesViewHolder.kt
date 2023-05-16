package com.example.messi.adapter

import android.content.DialogInterface.OnClickListener
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.messi.Games
import com.example.messi.R
import com.example.messi.databinding.ItemGamesBinding

class GamesViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val binding = ItemGamesBinding.bind(view)

    val juego = view.findViewById<TextView>(R.id.tvjuego)
    val distribuidor = view.findViewById<TextView>(R.id.tvdistribuidor)
    val precio = view.findViewById<TextView>(R.id.tvprecio)
    val foto = view.findViewById<ImageView>(R.id.ivGames)


    fun render(GamesModel: Games, onClickListener:(Games) -> Unit) {
        binding.tvjuego.text = GamesModel.juego
        binding.tvdistribuidor.text = GamesModel.distribuidor
        binding.tvprecio.text = GamesModel.precio
        Glide.with(binding.ivGames.context).load(GamesModel.foto).into(binding.ivGames)
        binding.ivGames.setOnClickListener { onClickListener(GamesModel) }
    }
}