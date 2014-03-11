package com.example.composite;

import android.util.Log;

/**
 * Created by BForte on 3/11/14.
 */
//Leaf
public class SimpleGraphic implements Graphic
{

    public void paint()
    {
        //run the paint operation
        Log.d("DEBUG", "SimpleGraphic paint method.");
    }

    /**
     * Because we have no children, these operations will do nothing
     **/
    public void add(Graphic g)
    {
        //unsupported operation
    }

    public void remove(Graphic g)
    {
        //unsupported operation
    }

    public Graphic get(int index)
    {
        //unsupported operation
        //public Graphic get(int index);
        return null;
    }
}