package com.linn.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNames : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.rvPosts)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override  fun onResume(){
        super.onResume()
        rvNames = findViewById(R.id.rvNames)
        val names = listOf("Sammy", "Isaac", "Ruth", "Eva", "Abby", "Immah", "Bonny", "Ashanti", "Ruth", "Eva", "Abby", "Immah", "Bonny", "Ashanti", "Ruth", "Eva", "Abby", "Immah", "Bonny", "Ashanti", "Ruth", "Eva", "Abby", "Immah", "Bonny", "Ashanti", "Ruth", "Eva", "Abby", "Immah", "Bonny", "Ashanti")

        val namesAdapter = NamesRvAdapter(names)
        rvNames.layoutManager = GridLayoutManager(this, 3)
        rvNames.adapter = namesAdapter
    }
}
