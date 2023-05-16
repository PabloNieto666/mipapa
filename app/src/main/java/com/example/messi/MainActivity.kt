package com.example.messi

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.messi.adapter.GamesAdapter
import com.example.messi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
        binding.recyclerGames.layoutManager = manager
        binding.recyclerGames.adapter =
            GamesAdapter(GamesProvider.gameFirst) { games ->
                onItemSelected(
                    games
                )
            }

    }

    fun onItemSelected(Games: Games){
        Toast.makeText(this, Games.juego, Toast.LENGTH_SHORT).show()

    }
}