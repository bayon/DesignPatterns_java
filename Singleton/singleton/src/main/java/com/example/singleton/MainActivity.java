package com.example.singleton;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//client code
        SingletonExample.getSingletonInstance().printSingleton();
        SingletonExample.getSingletonInstance().printSingleton();
        SingletonExample.getSingletonInstance().printSingleton();
        SingletonExample.getSingletonInstance().printSingleton();


    }



}
