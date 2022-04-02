package com.DesignPatterns.Creational.ObjectPool.Exp1;

import javafx.geometry.Point2D;

public class Client {

    public static final ObjectPool<Bitmap> bitmapPool=
            new ObjectPool<>(()-> new Bitmap("Logo.bmp"),5);

    public static void main(String[] args) {

        Bitmap bit1=bitmapPool.get();
        bit1.setLocation(new Point2D(10,10));

        Bitmap bit2=bitmapPool.get();
        bit2.setLocation(new Point2D(-10,0));

        bit1.draw();
        bit2.draw();

       bitmapPool.release(bit1);
       bitmapPool.release(bit2);
    }
}
