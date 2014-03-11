package com.example.factory;

import android.app.Activity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {



    static Map<String,EmployeeType> typeMap = new HashMap<String,EmployeeType>();
/*This EmployeeType ENUM class throws me off a bit.*/
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

            /*
           The role string is gotten from the hashmap of strings and employeeTypes, which calls its getRoles() abstract method, which calls the approperiate
           getRoles method based on type, which calls the appropriate roleType class that implements the basic Role class to get the role description.
             */


            String whatIstheRole = typeMap.get(empType).getRoles().getRole();
            System.out.println("FACTORY: Role of the Employee :::"+whatIstheRole);
        }
        catch (NullPointerException e)
        {
            System.out.println("FACTORY: No such Role is found");
            e.printStackTrace();
        }
    }



}
