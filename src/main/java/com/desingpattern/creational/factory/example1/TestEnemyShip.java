package com.desingpattern.creational.factory.example1;

public class TestEnemyShip {

    public static void main(String[] args) {
       /* EnemyShip ufoship = new UFOEnemyShip();
        doStuffEnemy(ufoship);*/


        EnemyShipFactory factory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        theEnemy = factory.makeEnemyShip("U");
        System.out.println(theEnemy.getName());


    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();

    }
}
