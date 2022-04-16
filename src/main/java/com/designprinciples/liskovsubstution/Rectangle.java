package com.designprinciples.liskovsubstution;

public class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int weight) {
        this.width = width;
        this.height = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int weight) {
        this.height = weight;
    }

    public int computeArea() {
        return width * height;
    }
}
