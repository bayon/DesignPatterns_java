package com.example.decorator2;

/**
 * Created by BForte on 3/10/14.
 */
public class SimpleIcecream implements Icecream {

    @Override
    public String makeIcecream() {
        return "DECORATOR:Simple Icecream ";
    }

}