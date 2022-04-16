package com.desingpattern.creational.singleton.lazysingleton;

public class Client {

    public static void main(String[] args) {
        LazyRegistryWithDCL registry = LazyRegistryWithDCL.getInstance();
        LazyRegistryWithDCL registry2 = LazyRegistryWithDCL.getInstance();

        System.out.println(registry == registry2);

    }


}
