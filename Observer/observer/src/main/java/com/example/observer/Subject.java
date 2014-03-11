package com.example.observer;



/**
 * Created by BForte on 3/11/14.
 */
public interface Subject {

    //methods to register
    public void register(Observer obj);
    public void unregister(Observer obj);

    // method to notify
    public void notifyObservers();

    // method to get updates from subject
    public Object getUpdate(Observer obj);


}
