package com.company;

public class GreatCar extends GoodCar {
    private int niceness;
    public GreatCar(String color, int niceness) {
        super(color);
        this.niceness = niceness;
    }
    public void move(){
        System.out.println("you are moved");
    }
}
