package com.example.mediator;

/**
 * Created by BForte on 3/10/14.
 */
// MEDIATOR

public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
