package com.tm00nlight.chihomework1

import android.app.Activity
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tm00nlight.chihomework1.data.Animal
import com.tm00nlight.chihomework1.data.Bear
import com.tm00nlight.chihomework1.data.Bird
import com.tm00nlight.chihomework1.data.WildCat

class AnimalAdapter () : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    private val animals = listOf<Animal>(
        Bird("Owl"), WildCat("Leopard"), Bird("Parrot"), Bear("Panda"),
        Bear("Coala"), WildCat("Lion"), Bird("Peacock")
    )
    private lateinit var soundCallback: AnimalSound

    fun setCallback(callback: AnimalSound){
        soundCallback = callback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val layout = when(viewType){
            0 -> R.layout.bird_list_item
            1 -> R.layout.bear_list_item
            2 -> R.layout.wild_cat_list_item
            else -> throw IllegalArgumentException("Invalid type")
        }

        val view = LayoutInflater
            .from(parent.context)
            .inflate(layout, parent, false)

        return AnimalViewHolder(view, soundCallback)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals[position]
        holder.nameView.text = animal.name
    }

    override fun getItemCount(): Int {
        return animals.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(animals[position]) {
            is Bird -> 0
            is Bear -> 1
            is WildCat -> 2
            else -> 10
        }
    }


    inner class AnimalViewHolder(itemView: View, callback: AnimalSound) : RecyclerView.ViewHolder(itemView) {
        val nameView = itemView.findViewById<TextView>(R.id.nameView)
        val soundButton = itemView.findViewById<Button>(R.id.soundButton)

        init {
            soundButton.setOnClickListener {
                callback.makeSound(animals[adapterPosition].name, animals[adapterPosition].sound())
            }
        }
    }

}