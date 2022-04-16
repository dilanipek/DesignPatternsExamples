package com.desingpattern.structural.bridge.example2;

public class OldRemote implements Remote {
    @Override
    public void on() {
        System.out.println("ON with Old Remote");
    }

    @Override
    public void off() {
        System.out.println("Off with Old Remote");

    }
}
