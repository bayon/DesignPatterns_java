package com.example.visitor;

/**
 * Created by BForte on 3/10/14.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}
