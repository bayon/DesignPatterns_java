package com.example.builder;

/**
 * Created by BForte on 3/10/14.
 */
public class Zealot extends Unit {

    public String toString() {
        return "Zealot is ready!"+
                "\n\"Builder: \"+ HitPoints: "+getHitPoints()+
                "\n\"Builder: \"+ Armor: "+getArmor()+
                "\n\"Builder: \"+ Damage: "+getDamage();
    }

}