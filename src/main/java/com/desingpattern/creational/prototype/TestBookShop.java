package com.desingpattern.creational.prototype;

public class TestBookShop {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setShopName("DilansBS");
        shop.loadData();

        BookShop shop2 = shop.clone();
        shop2.setShopName("IpeksBS");

        shop.getBooks().remove(2);

    }
}
