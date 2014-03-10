package com.example.decorator;

/**
 * Created by BForte on 3/10/14.
 */
public class ChickenTikkaPizza extends PizzaDecorator {
    /*public ChickenTikkaPizza(Pizza newPizza) {
        super(newPizza);
    }
    */

    public ChickenTikkaPizza(BasicPizza basicPizza) {
        super(basicPizza);
    }

    public String bakePizza() {
        return pizza.bakePizza() + "with Chicken topping added. :DECORATOR";
    }
}
