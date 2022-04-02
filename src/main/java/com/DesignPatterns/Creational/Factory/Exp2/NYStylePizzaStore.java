package com.DesignPatterns.Creational.Factory.Exp2;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {

        if (type.equals("cheese"))
            return new NYStyleCheesePizza();
        else if (type.equals("pepperoni"))
            return new NYStylePepperoniPizza();
        else if (type.equals("veggie"))
            return new NYStyleVeggiePizza();
        else
            return null;
    }
}
