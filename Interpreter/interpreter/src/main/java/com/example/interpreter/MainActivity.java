package com.example.interpreter;

import android.app.Activity;
import android.os.Bundle;


/**
 *
 * THIS IS ALL JACKED UP !!!
 */












public class MainActivity extends Activity {
/*
 A more interesting and useful application of Interpreter is when you need a program to produce different types of output, such as a report generator.
 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// client
        InterpreterContext context  = new InterpreterContext("http://aws.amazon.com/");
        AmazonClient client = new AmazonClient(context);

        //run a query
        String result = client.interpret("books by author 'John Connolly'");

        System.out.println(result);
    }


}
