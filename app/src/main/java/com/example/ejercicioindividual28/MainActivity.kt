package com.example.ejercicioindividual28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ejercicioindividual28.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerView()

    }

    fun initRecyclerView(){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = Adapter(Provider.banderaList)
    }
}