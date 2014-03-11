package com.example.decorator2;

/**
 * Created by BForte on 3/10/14.
 */
public class HoneyDecorator extends IcecreamDecorator {

    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney();
    }

    private String addHoney() {
        return "-DECORATOR:  + HONEY ";
    }
}
