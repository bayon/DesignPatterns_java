package com.example.prototype;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Unicellular amoeba = new Amoeba();

        List< Unicellular > amoebaList = new ArrayList< Unicellular >();

        amoebaList.add(amoeba.reproduce());
        amoebaList.add(amoeba.reproduce());
        amoebaList.add(amoeba.reproduce());

        for (Unicellular a : amoebaList)
            System.out.println("PROTOTYPE:"+ a);
    }



}
