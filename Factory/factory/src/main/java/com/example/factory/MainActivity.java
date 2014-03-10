package com.example.factory;

import android.app.Activity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {



    static Map<String,EmployeeType> typeMap = new HashMap<String,EmployeeType>();

    static
    {
        typeMap.put("cto", EmployeeType.CTO);
        typeMap.put("ceo", EmployeeType.CEO);
        typeMap.put("cfo", EmployeeType.CFO);
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String empType = "ceo";
        try
        {
            long startTime = System.nanoTime();
            String whatIstheRole = typeMap.get(empType).getRoles().getRole();
            System.out.println("FACTORY: Role of the Employee :::"+whatIstheRole);
            long endTime = System.nanoTime();
            System.out.println("FACTORY: Time difference ::: "+(endTime-startTime)+" nano seconds");
        }
        catch (NullPointerException e)
        {
            System.out.println("FACTORY: No such Role is found");
            e.printStackTrace();
        }
    }



}
