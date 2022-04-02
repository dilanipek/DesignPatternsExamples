package com.DesignPatterns.Creational.AbstractFactory.Exp2;

public interface Instance {
    enum Capacity{micro,small, large}
    void start();
    void attachStorage(Storage storage);
    void stop();

}
