package com.example.prototype;

/**
 * Created by BForte on 3/10/14.
 */
public class Amoeba implements Unicellular {

    public Unicellular reproduce() {
        Unicellular amoeba = null;
        try {
            amoeba = (Unicellular) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return amoeba;
    }

    public String toString() {
        return "Bla bla bla it's a new amoeba...";
    }

}