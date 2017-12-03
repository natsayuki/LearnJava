package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name ="name";
//        player.health = 20;
//        player.weapon = "saasdfasdfsdf";
        EnhancedPlayer player = new EnhancedPlayer("asdf", 50, "awsd");
        System.out.println("init health = " + player.getHealth());
    }
}
