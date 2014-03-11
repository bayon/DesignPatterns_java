package com.example.composite;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GraphicsClient gc = new GraphicsClient();
         SimpleGraphic sg = new SimpleGraphic(); // or rectangle, or circle , etc....

        gc.paint(sg);
    }



}
