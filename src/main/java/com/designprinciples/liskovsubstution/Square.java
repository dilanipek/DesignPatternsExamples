package com.designprinciples.liskovsubstution;

public class Square implements Shape {
    private int side;


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    @Override
    public int computeArea() {
        return side * side;
    }
}
