package com.company;

public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <= 0){
            System.out.println("player death");
        }
    }

    public int getHealth() {
        return health;
    }
}
