package com.example.state;

/**
 * Created by BForte on 3/10/14.
 */
public class Spring implements Season {

    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("SEASON: Spring is now.");
        context.setSeason(new Summer());
    }

}