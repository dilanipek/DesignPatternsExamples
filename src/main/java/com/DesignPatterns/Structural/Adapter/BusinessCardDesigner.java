package com.DesignPatterns.Structural.Adapter;

//Client code requires Customer interface
public class BusinessCardDesigner {

    public String designCard(Customer  customer){
        String card = "";
        card += customer.getName();
        card += "\n" + customer.getDesignation();
        card += "\n" + customer.getAddress();
        return card;
    }
}
