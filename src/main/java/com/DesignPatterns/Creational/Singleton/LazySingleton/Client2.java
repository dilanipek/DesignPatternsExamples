package com.DesignPatterns.Creational.Singleton.LazySingleton;

public class Client2 {
    public static void main(String[] args) {
        LazyRegistryIODH registryIODH;
        registryIODH=LazyRegistryIODH.getInstance();
        registryIODH=LazyRegistryIODH.getInstance();

        System.out.println("Done");
    }
}
