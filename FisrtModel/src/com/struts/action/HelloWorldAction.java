package com.struts.action;

public class HelloWorldAction {


    private String name;

    public String execute() throws Exception {
        return "succ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
