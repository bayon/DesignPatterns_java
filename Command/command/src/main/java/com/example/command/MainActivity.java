package com.example.command;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Client class code:
        Document doc = new Document();
        ActionListenerCommand clickOpen = new ActionOpen(doc);
        ActionListenerCommand clickSave = new ActionSave(doc);
        MenuOptions menu = new MenuOptions(clickOpen, clickSave);
        menu.clickOpen();
        menu.clickSave();

    }



}
