package com.example.interpreter;

import android.graphics.Movie;

import java.util.ArrayList;

/**
 * Created by BForte on 3/11/14.
 */
//Context 
public class InterpreterContext
{
    //assume web service is setup
    private AmazonWebService webService;

    public InterpreterContext(String endpoint)
    {
        //create the web service.
    }

    public ArrayList<Movie> getAllMovies()
    {
        return webService.getAllMovies();
    }

    public ArrayList<Book> getAllBooks()
    {
        return webService.getAllBooks();

    }
}
