package com.example.factory;

/**
 * Created by BForte on 3/10/14.
 */
public class TestFactoryDesign
{
    /*
    static Map<String,EmployeeType> typeMap = new HashMap<String,EmployeeType>();


    static
    {
        typeMap.put("cto", EmployeeType.CTO);
        typeMap.put("ceo", EmployeeType.CEO);
        typeMap.put("cfo", EmployeeType.CFO);
    }

    public static void main(String[] args)
    {
        String empType = "ceo";
        try
        {
            long startTime = System.nanoTime();
            String whatIstheRole = typeMap.get(empType).getRoles().getRole();
            System.out.println("Role of the Employee :::"+whatIstheRole);
            long endTime = System.nanoTime();
            System.out.println("Time difference ::: "+(endTime-startTime)+" nano seconds");
        }
        catch (NullPointerException e)
        {
            System.out.println("No such Role is found");
            e.printStackTrace();
        }
    }
    */
}
