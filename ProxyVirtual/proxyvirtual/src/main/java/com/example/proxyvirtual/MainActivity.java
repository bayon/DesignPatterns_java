package com.example.proxyvirtual;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Image img1 = new ProxyImage("Image***1");
        final Image img2 = new ProxyImage("Image***2");
        img1.showImage();
        img2.showImage();
    }


}
