package com.tm00nlight.chihomework1.data

import android.util.Log

class Bird (override val name: String) : Animal() {
    override val isFlying: Boolean = true

    override fun sound() {

    }
}