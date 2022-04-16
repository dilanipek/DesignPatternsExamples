package com.desingpattern.creational.singleton.eagersingleton;


public class Client {
    public static void main(String[] args) {

        EagerRegistry registry = EagerRegistry.getInstance();
        System.out.println(registry);
        EagerRegistry registry2 = EagerRegistry.getInstance();
        System.out.println(registry2);
        System.out.println(registry == registry2);

    }
}
