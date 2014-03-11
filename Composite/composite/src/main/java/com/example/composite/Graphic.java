package com.example.composite;

/**
 * Created by BForte on 3/11/14.
 */
//Component interface
public interface Graphic
{
    public void add(Graphic g);
    public void remove(Graphic g);
    public Graphic get(int index);
    public void paint();
}