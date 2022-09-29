package com.tm00nlight.chihomework1

import android.content.Context
import android.util.Log
import android.widget.Toast

interface AnimalSound {
    fun makeSound(name: String, voice: String) {
        Log.d("VOICE", "$name says $voice")
    }
}