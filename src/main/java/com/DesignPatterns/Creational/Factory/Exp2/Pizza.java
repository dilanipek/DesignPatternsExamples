package com.DesignPatterns.Creational.Factory.Exp2;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println(getName() + " pizza is preparing");
        System.out.println("Tossing dough..." + dough);
        System.out.println("Adding sauce ..." + sauce);
        System.out.println("Adding toppings ...");
        toppings.stream().forEach(top -> System.out.println(top));

    }


    public void bake() {
        System.out.println("Bake for 25 minutes at 350");

    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");

    }

    public void box() {

        System.out.println("Place pizza in official Pizzastore box.");


    }

    public String getName() {
        return name;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }


}
