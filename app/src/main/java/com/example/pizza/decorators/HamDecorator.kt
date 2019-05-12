package com.example.pizzeria

import com.example.pizza.model.AbstractPizza


class HamDecorator(var pizza: AbstractPizza) : AbstractPizzaDecorator(pizza) {
    override fun getName(): String {
        return pizza.getName()+"Szynka"  }

    override fun getPrice(): Double {
        return pizza.getPrice()+8.50   }


}