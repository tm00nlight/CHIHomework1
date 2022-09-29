package com.tm00nlight.chihomework1.data

class WildCat (override val name: String) : Animal() {
    override val isFlying: Boolean = false

    override fun sound(): String = "roar"
}