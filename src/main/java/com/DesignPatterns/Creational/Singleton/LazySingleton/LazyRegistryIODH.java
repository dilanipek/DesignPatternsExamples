package com.DesignPatterns.Creational.Singleton.LazySingleton;

public class LazyRegistryIODH {

    private LazyRegistryIODH(){
        System.out.println("inside of LazyRegistryIODH");

    }
     private static class RegistryHolder{
        static LazyRegistryIODH INSTANCE= new LazyRegistryIODH();

     }
     public static LazyRegistryIODH getInstance(){
        return RegistryHolder.INSTANCE;
     }
}
