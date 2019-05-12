package com.example.pizzeria

import com.example.pizza.model.AbstractPizza

abstract class AbstractPizzaDecorator(pizza: AbstractPizza) : AbstractPizza() {
    abstract override fun getName(): String
}