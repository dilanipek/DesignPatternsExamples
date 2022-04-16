package com.desingpattern.creational.factory.example2;

public class PizzaTestDrive {
    public static void main(String[] args) {

        PizzaStore nystore = new NYStylePizzaStore();
        PizzaStore chicagostore = new ChicagoStylePizzaStore();

        Pizza pizza = nystore.orderPizza("cheese");
        System.out.println("I ordered for me this pizza called like:" + pizza.getName());

        pizza = chicagostore.orderPizza("cheese");
        System.out.println("I ordered for my friend this pizza called like:" + pizza.getName());

    }
}
