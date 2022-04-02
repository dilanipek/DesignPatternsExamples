package com.DesignPatterns.Creational.AbstractFactory.Exp2;

public class Client {
    private ResourceFactory factory;
    public Client(ResourceFactory factory){
        this.factory=factory;
    }
    public Instance createServer(Instance.Capacity capacity,int storageMib){

        Instance instance=factory.createInstance(capacity);
        Storage storage=factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return  instance;

    }
    public static void main(String[] args) {

        Client aws= new Client(new AWSResourceFactory());
        Instance i1= aws.createServer(Instance.Capacity.micro,20408);
        i1.start();
        i1.stop();


    }
}
