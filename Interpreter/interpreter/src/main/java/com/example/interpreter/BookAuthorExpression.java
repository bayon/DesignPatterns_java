package com.example.interpreter;

import java.util.ArrayList;

/**
 * Created by BForte on 3/11/14.
 */
//Concrete Expression 
public class BookAuthorExpression extends AbstractExpression
{

    private String searchString;

    public BookAuthorExpression(String searchString)
    {
        this.searchString = searchString;
    }

    public String interpret(InterpreterContext context)
    {
        ArrayList<Book> books = context.getAllBooks();
        StringBuffer stringBuffer = new StringBuffer();
        for(Book book: books)
        {
            if(book.getAuthor().equalsIgnoreCase(searchString))
            {
                stringBuffer.append(book.toString());
            }
        }
        String result = stringBuffer.toString();
        return result;

    }

}
