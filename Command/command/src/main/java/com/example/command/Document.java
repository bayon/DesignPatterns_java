package com.example.command;

import android.util.Log;

/**
 * Created by BForte on 3/10/14.
 */

//Receiver class:
public class Document {
    public void Open(){
       // System.out.println('Document Opened');
        Log.d("DEBUG","COMMAND: doc opened");
    }
    public void Save(){
       // System.out.println('Document Saved');
        Log.d("DEBUG","COMMAND: doc saved");
    }
}
