package com.designprinciples.liskovsubstution;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println(rectangle.computeArea());

        Square square = new Square();
        square.setSide(10);

        System.out.println(square.computeArea());


    }


}
