package com.example.state;

/**
 * Created by BForte on 3/10/14.
 */
public class Summer implements Season {

    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("SEASON: Summer is now.");
        context.setSeason(new Fall());
    }

}