package com.DesignPatterns.Creational.Prototype.Exp1;

public class TestBookShop {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop=new BookShop();
        shop.setShopName("DilansBS");
        shop.loadData();
        System.out.println(shop);

        BookShop shop2= shop.clone();
        shop2.setShopName("IpeksBS");
        System.out.println(shop2);

        shop.getBooks().remove(2);
        System.out.println("after removing....***");
        System.out.println(shop);
        System.out.println(shop2);


    }
}
