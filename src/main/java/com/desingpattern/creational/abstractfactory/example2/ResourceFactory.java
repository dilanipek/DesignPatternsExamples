package com.desingpattern.creational.abstractfactory.example2;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);

    Storage createStorage(int capMib);

}
