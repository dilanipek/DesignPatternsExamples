package com.DesignPatterns.Structural.Bridge.Exp2;

public class Client {
    public static void main(String[] args) {
            TV sonyOldRemote= new Sony(new OldRemote());
            sonyOldRemote.on();
            sonyOldRemote.off();
           System.out.println();

           TV philipsNewRemote= new Philips(new NewRemote());
           philipsNewRemote.on();
           philipsNewRemote.off();

    }
}
