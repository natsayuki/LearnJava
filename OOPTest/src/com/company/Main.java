package com.company;

public class Main {

    public static void main(String[] args) {
        BurgerShop BillsBurgers = new BurgerShop();
        Burger HeathBurger = new Burger("Whole Wheat", "Health Meat", new String[] {"lettuce", "tomato", "health paste"});
        Burger DeluxeBurger = new Burger("bad", "meat", new String[] {"soda", "drink"});
        BillsBurgers.order(new Burger("white", "cow", new String[] {"Carrot", "lettuce"}));
        BillsBurgers.order(HeathBurger);
        BillsBurgers.order(DeluxeBurger);

    }
}
