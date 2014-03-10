package com.example.builder;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UnitBuilder builder = new ZealotBuilder();
        Gateway director = new Gateway();
        Unit product = director.constructUnit(builder);
        System.out.println("Builder: "+product);
    }



}
