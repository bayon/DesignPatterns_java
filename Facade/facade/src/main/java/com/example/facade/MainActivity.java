package com.example.facade;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   //client
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("OR123456");
        System.out.println("FACADE: Order processing completed");


    }




}
