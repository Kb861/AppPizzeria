package com.example.pizza.decorators

import com.example.pizza.model.AbstractPizza
import com.example.pizzeria.AbstractPizzaDecorator


class PineappleDecorator(var pizza: AbstractPizza) : AbstractPizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName()+"Ananas"  }

    override fun getPrice(): Double {
        return pizza.getPrice()+10  }


}