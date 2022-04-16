package com.desingpattern.structural.bridge.example2;

public class Philips extends TV {

    Remote remoteType;

    Philips(Remote r) {
        super(r);
        this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Philips TV ON:");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Philips TV OFF:");
        remoteType.off();

    }
}
