package com.company;

public class GoodCar extends Car {

    private String color;

    public GoodCar(String color) {
        super(4);
        this.color = color;
    }

    private void moveWheels(){
        System.out.println("Your wheels have been moves");
    }

    @Override
    public void go(String direction) {
        System.out.println("wow you went ");
    }
}
