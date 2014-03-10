package com.example.visitor;

/**
 * Created by BForte on 3/10/14.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);
    int visit(Fruit fruit);
}
