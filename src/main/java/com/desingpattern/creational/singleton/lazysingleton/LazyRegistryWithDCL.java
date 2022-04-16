package com.desingpattern.creational.singleton.lazysingleton;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {
    }

    /* volatile forces value read/write from main memory instead of cache. */

    private static volatile LazyRegistryWithDCL INSTANCE;

    public static LazyRegistryWithDCL getInstance() {
        if (INSTANCE == null) {
            synchronized (LazyRegistryWithDCL.class) {
                if (INSTANCE == null) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }

        }


        return INSTANCE;
    }

}
