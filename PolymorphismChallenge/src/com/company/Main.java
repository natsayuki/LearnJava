package com.company;

class car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public car(String name, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public void go(){
        System.out.println("car has gone");
    }
    public void stop(){
        System.out.println("car has stopped");
    }
    public void startEngine(){
        System.out.println("engine has been started");
    }
}

class goodCar extends car{
    public goodCar() {
        super("Good CAr", 4, 4);
    }

    @Override
    public void go() {
        System.out.println("going");
    }
}

class crapCar extends car{
    public crapCar() {
        super("Crap Car", 3, 2);
    }

    @Override
    public void go() {
        System.out.println("no");
    }
}

class alrightCar extends car {
    public alrightCar() {
        super("Alright Car", 3 , 4);
    }

    @Override
    public void go() {
        System.out.println("ok");
    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
