package com.company;

public class EnhancedPlayer {
    private String name;
    private int pointsOfTheHealthVariety = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health > 0 && health <= 100){
            this.pointsOfTheHealthVariety = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.pointsOfTheHealthVariety -= damage;
        if(this.pointsOfTheHealthVariety <= 0){
            System.out.println("player death");
        }
    }

    public int getHealth() {
        return pointsOfTheHealthVariety;
    }
}
