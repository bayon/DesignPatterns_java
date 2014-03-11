package com.example.state;

/**
 * Created by BForte on 3/10/14.
 */
public class SeasonContext {
    private Season season;

    public SeasonContext() {
        this.season = new Winter();
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void whatIsTheSeason() {
        season.theSeason(this);
    }
}
