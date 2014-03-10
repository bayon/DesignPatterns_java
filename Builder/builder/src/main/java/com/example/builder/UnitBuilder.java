package com.example.builder;

/**
 * Created by BForte on 3/10/14.
 */
public interface UnitBuilder {

    public void buildHitPoints();
    public void buildArmor();
    public void buildDamage();
    public Unit getUnit();

}