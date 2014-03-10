package com.example.adapter;

/**
 * Created by BForte on 3/10/14.
 */
public class EuropeanAdapter extends UKPlug implements PlugConverter {
    @Override
    public String getEuropePlug() {
        String cylindricalStem1 = getRectangularStem1();
        String cylindricalStem2 = getRectangularStem2();
        return "ADAPTER: converted European Plug Points: " + cylindricalStem1 + " and "
                + cylindricalStem2;
    }
}
