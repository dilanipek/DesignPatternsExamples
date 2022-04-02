package com.DesignPatterns.Structural.Composite.Exp2;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
    ArrayList menuComponents=new ArrayList();

     String name;
     String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
       menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(getName() + " , " + getDescription());

        Iterator iterator=menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent component= (MenuComponent) iterator.next();
            component.print();
        }
    }
}
