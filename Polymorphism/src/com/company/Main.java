package com.company;

class movie{
    private String name;

    public movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
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

class MazeRunner extends movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "kids in maze";
    }
}

class StarWars extends movie {
    public StarWars() {
        super("Star Warse");
    }

    @Override
    public String plot() {
        return "A war in the starts";
    }
}

class Forgetable extends movie {
    public Forgetable() {
        super("Forgtable Movie");
    }
}

public class Main {

    public static void main(String[] args) {
        for(int i = 1; i < 11; i++){
            movie Movie = randomMovie();
            System.out.println("Movie #" + i + " : " + Movie.getName() + "\n" + "Plot: " + Movie.plot() + "\n");
        }
    }

    public static movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new Forgetable();
        }
        return null;
    }
}
