package com.example.adapter;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlugConverter targetInterface = new EuropeanAdapter();
        System.out.println("ADAPTER: Now the European plugpoint connects with"
                + targetInterface.getEuropePlug());
    }




}
