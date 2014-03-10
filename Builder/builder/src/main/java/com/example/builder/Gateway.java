package com.example.builder;

/**
 * Created by BForte on 3/10/14.
 */
public class Gateway {

    public Unit constructUnit(UnitBuilder builder) {
        builder.buildHitPoints();
        builder.buildArmor();
        builder.buildDamage();
        return builder.getUnit();
    }

}