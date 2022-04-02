package com.DesignPatterns.Creational.Builder.Example2;

public class RobotEngineer {

    private RobotBuilder robotBuilder;

    public RobotEngineer( RobotBuilder builder){
        this.robotBuilder=builder;
    }

    public Robot getRobot(){

      return  this.robotBuilder.getRobot();
    }

    public void makeRobot(){
      robotBuilder.buildRobotHead();
      robotBuilder.buildRobotTorso();
      robotBuilder.buildRobotArms();
      robotBuilder.buildRobotLegs();
    }


}
