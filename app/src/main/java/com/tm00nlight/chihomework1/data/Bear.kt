package com.tm00nlight.chihomework1.data

import android.util.Log

class Bear (override val name: String) : Animal() {
    override val isFlying: Boolean = false

    override fun sound(): String = "growl"
}