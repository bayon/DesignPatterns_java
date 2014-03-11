package com.example.state;

/**
 * Created by BForte on 3/10/14.
 */
public class Fall implements Season {

    @Override
    public void theSeason(SeasonContext context) {
        System.out.println("SEASON: Fall is now.");
        context.setSeason(new Winter());
    }

}