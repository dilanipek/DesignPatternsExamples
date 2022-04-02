package com.DesignPatterns.Creational.AbstractFactory.Exp2;

public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        //Use gcp api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
