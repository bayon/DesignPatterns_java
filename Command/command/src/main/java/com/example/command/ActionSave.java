package com.example.command;

/**
 * Created by BForte on 3/10/14.
 */
public class ActionSave implements ActionListenerCommand {
    private Document adoc;

    public ActionSave(Document doc) {
        this.adoc = doc;
    }
    @Override
    public void execute() {
        adoc.Save();
    }
}

