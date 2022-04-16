package com.desingpattern.structural.bridge.example2;

public class NewRemote implements Remote {
    @Override
    public void on() {
        System.out.println("on with new remote");
    }

    @Override
    public void off() {
        System.out.println("off with new remote");
    }
}
