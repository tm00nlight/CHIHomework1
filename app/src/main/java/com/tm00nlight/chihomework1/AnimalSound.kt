package com.tm00nlight.chihomework1

import android.util.Log
import android.widget.Toast

interface AnimalSound {
    fun squawk(): String = "squawk"
    fun roar(): String = "roar"
    fun growl(): String = "growl"
}