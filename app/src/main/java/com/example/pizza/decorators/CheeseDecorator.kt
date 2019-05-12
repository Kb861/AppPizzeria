package com.example.pizzeria

import com.example.pizza.model.AbstractPizza


class CheeseDecorator(var pizza: AbstractPizza) : AbstractPizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName()+"Ser"  }

    override fun getPrice(): Double {
        return pizza.getPrice()+5.60  }


}