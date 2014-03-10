package com.example.command;

/**
 * Created by BForte on 3/10/14.
 */
//Concrete Command:
public class ActionOpen implements ActionListenerCommand {
    private Document adoc;

    public ActionOpen(Document doc) {
        this.adoc = doc;
    }
    @Override
    public void execute() {
        adoc.Open();
    }
}
