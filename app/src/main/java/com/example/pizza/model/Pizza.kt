package com.example.pizzeria

import com.example.pizza.model.AbstractPizza

class Pizza : AbstractPizza() {

    override fun getName(): String {
        return "Margarita"
    }

    override fun getPrice(): Double {
        return 20.00
    }
}