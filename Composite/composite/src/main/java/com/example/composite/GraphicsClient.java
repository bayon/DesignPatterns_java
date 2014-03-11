package com.example.composite;

import android.util.Log;

/**
 * Created by BForte on 3/11/14.
 */
//Client.
public class GraphicsClient
{
    /**
     * Given a graphics context, client can just call paint, without worrying if this is a composite or leaf
     **/
    public void paint(Graphic g)
    {
        Log.d("DEBUG", "GraphicsClient paint method.");
        g.paint();

    }
}
