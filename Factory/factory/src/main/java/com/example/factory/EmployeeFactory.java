package com.example.factory;

/**
 * Created by BForte on 3/10/14.
 */
public abstract class EmployeeFactory
{
    public static Roles getRole( String type )
    {
        Roles roles = null;
        if( type.equals("cfo"))
            roles = new CFORoles();
        else if( type.equals("cto"))
            roles = new CTORoles();
        else if( type.equals("ceo"))
            roles = new CEORoles();
        return roles;
    }
}