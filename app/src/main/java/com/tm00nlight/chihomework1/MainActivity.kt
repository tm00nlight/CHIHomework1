package com.tm00nlight.chihomework1

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tm00nlight.chihomework1.data.Animal
import com.tm00nlight.chihomework1.data.Bear
import com.tm00nlight.chihomework1.data.Bird
import com.tm00nlight.chihomework1.data.WildCat

class MainActivity : AppCompatActivity(), AnimalSound {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = AnimalAdapter()
        recyclerView = findViewById(R.id.recycler)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        adapter.setCallback(this)
    }

    override fun makeSound(name: String, voice: String) {
        Toast.makeText(this, "$name says $voice", Toast.LENGTH_LONG).show()
    }

}