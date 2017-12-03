package com.company;

class movie{
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends movie{
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark east lots of people";
    }
}

class IndependenceDay extends movie{
    public IndependenceDay() {
        super("Indpendence Day");
    }

    @Override
    public String plot() {
        return "Aliens try to take over";
    }
}

public class Main {

    public static void main(String[] args) {

    }
}
