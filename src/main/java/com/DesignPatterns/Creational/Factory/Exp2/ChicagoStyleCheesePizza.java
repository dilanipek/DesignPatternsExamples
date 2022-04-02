package com.DesignPatterns.Creational.Factory.Exp2;

public class ChicagoStyleCheesePizza extends  Pizza{

    public ChicagoStyleCheesePizza(){
        name="Chicago Style Cheese pizza";
        dough="Extra Thick crust dough";
        sauce="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }


    @Override
    public void cut(){

        System.out.println("Cutting the pizza into square slices");


    }
}
