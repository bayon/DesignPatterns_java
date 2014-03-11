package com.example.observer;

/**
 * Created by BForte on 3/11/14.
 */
public interface Observer {

    //method to update the observer, used by the subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);



}
