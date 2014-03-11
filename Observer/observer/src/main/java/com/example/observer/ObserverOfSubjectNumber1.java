package com.example.observer;

/**
 * Created by BForte on 3/11/14.
 */
public class ObserverOfSubjectNumber1 implements Observer{

    private String name;
    private Subject topic;

    public ObserverOfSubjectNumber1(String nm){
        this.name=nm;
    }


    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }
}
