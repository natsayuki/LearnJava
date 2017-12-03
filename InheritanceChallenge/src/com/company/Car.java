package com.company;

public class Car {
    private int wheels;
    private int speed;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public int setSpeed(int speed){
        this.speed = speed;
        System.out.println("You are now going " + speed);
        return speed;
    }
    public int speedUp(int speed){
        this.speed += speed;
        System.out.println("You are now going " + this.speed);
        return this.speed;
    }
    public int slowDown(int speed){
        this.speed -= speed;
        System.out.println("You are now going " + this.speed);
        return this.speed;
    }
    public void go(String direction){
        System.out.println("Your car goes " + direction);
    }
}
