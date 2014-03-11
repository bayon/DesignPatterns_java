package com.example.decorator2;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*

        Icecream is an interface that declares a method makeIceCream that returns a string.
        SimpleIcecream implements Icecream and overrides uses the makeIcecream method to retuen a string describing itself.

        IcecreamDecorator is the "head decorator" that implements Icecream and in addition to implementing Icecream methods, it has a constructor
        that accepts an Icecream object and stores it as a property.

        NuttyDecorator extends IcecreamDecorator and overrides its makeIcecream method and adds additional functionality via more custom methods.
        And the HoneyDecorator does the same thing that the NUtyDecorator does.

        When the ultimate icecream is created below, it displays the results from inner parenthesis outward.
         */

        Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));

        System.out.println(icecream.makeIcecream());


    }



}
