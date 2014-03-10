package com.example.mediator;

/**
 * Created by BForte on 3/10/14.
 */

//CONCRETE COLLEAGUE
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg){
        System.out.println("MEDIATOR: "+this.name+": Sending Message="+msg);
        mediator.sendMessage(msg, this);
    }
    @Override
    public void receive(String msg) {
        System.out.println("MEDIATOR: "+this.name+": Received Message:"+msg);
    }

}