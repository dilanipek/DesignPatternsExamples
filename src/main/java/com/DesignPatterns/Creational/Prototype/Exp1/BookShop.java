package com.DesignPatterns.Creational.Prototype.Exp1;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{

    private String shopName;
    List<Book> books=new ArrayList<>();


    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void loadData(){

        for (int i=0;i<10;i++){
            Book b = new Book();
            b.setbId(i);
            b.setbName("Book " +i);
            getBooks().add(b);
        }

    }
    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }
/*
    //shallow cloning two references that shows the same object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */

    //deep  cloning --- different two types prototypes for 2 different objects
    @Override
    protected BookShop clone() throws CloneNotSupportedException {

        BookShop deepClonedShop=new BookShop();
        for (Book book:this.getBooks()) {
            deepClonedShop.getBooks().add(book);
        }
        return deepClonedShop;
    }
}
