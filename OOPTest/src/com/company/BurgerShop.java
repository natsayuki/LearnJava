package com.company;

public class BurgerShop {

    public double getTotal(Burger burger){
        double addonPrice = 0;
        for(int i = 0; i < burger.getAddons().length; i++){
            addonPrice += .25;
        }
        return 2.50 + addonPrice;
    }

    public void order(Burger burger){
        System.out.printf("You have ordered a " + burger.getMeat() + " burger on " + burger.getBread());
        for(int i = 0; i < burger.getAddons().length; i++){
            if(i == 0){
                System.out.printf(" with " + burger.getAddons()[i]);
            }else{
                System.out.printf(" and " + burger.getAddons()[i]);
            }
        }
        System.out.printf(" for a total of " + getTotal(burger));
        System.out.printf("\n");

    }
}
