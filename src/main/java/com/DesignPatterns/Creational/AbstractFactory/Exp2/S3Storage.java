package com.DesignPatterns.Creational.AbstractFactory.Exp2;

public class S3Storage implements Storage{

    public S3Storage(int capacityInMib) {
        //Use aws s3 api
        System.out.println("Allocated "+capacityInMib+" on S3");
    }
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
