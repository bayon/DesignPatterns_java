package com.example.state;

/**
 * Created by BForte on 3/10/14.
 */
public class Winter implements Season {

    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("SEASON: Winter is now.");
        context.setSeason(new Spring());
    }

}