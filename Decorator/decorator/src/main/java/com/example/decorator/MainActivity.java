package com.example.decorator;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pizza pizza = new ChickenTikkaPizza(new BasicPizza());//new BasicPizza()
        System.out.println(pizza.bakePizza());


    }



}
