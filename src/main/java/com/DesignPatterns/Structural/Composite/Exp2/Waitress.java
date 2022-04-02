package com.DesignPatterns.Structural.Composite.Exp2;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;

    }

    public void printMenu() {
        allMenus.print();
    }
}