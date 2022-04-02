package com.DesignPatterns.Creational.AbstractFactory.Exp2;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage  createStorage(int capMib);

}
