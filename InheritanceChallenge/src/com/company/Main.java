package com.company;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(4);
        GoodCar goodcar = new GoodCar("blue");
        GreatCar greatcar = new GreatCar("yellow", 42);

        car.go("north");
        goodcar.go("north");
        greatcar.move();
    }
}
