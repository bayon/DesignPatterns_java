package com.example.decorator;

/**
 * Created by BForte on 3/10/14.
 */
public abstract class PizzaDecorator implements Pizza {
    Pizza pizza;
    public PizzaDecorator(Pizza newPizza) {
        this.pizza = newPizza;
    }

    public PizzaDecorator(BasicPizza basicPizza) {
        this.pizza = basicPizza;
    }

    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
}