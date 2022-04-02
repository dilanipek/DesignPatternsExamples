package com.DesignPatterns.Structural.Bridge.Exp2;

public class Sony extends TV{

    Remote remoteType;

    Sony(Remote r){
        super(r);
        this.remoteType=r;
    }

    @Override
    void on() {
        System.out.println("Sony TV ON:");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Sony TV OFF:");
        remoteType.off();

    }
}
