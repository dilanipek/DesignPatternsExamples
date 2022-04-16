package com.desingpattern.structural.composite.example2;

public class MenuTestDrive {

    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("Pancake House Menu", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert Of Course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("pasta",
                "Spaghetti with Marinara Sauce", true, 3.89));

        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie",
                "Apple Pie with a flakey crust,topped with vanilla ice cream",
                true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();


    }
}
