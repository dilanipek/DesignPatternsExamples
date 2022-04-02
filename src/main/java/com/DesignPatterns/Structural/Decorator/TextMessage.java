package com.DesignPatterns.Structural.Decorator;
//concrete component
public class TextMessage implements Message{

    private String msg;

    public TextMessage(String msg){

        this.msg=msg;
    }
    @Override
    public String getContent() {
        return msg;
    }
}
