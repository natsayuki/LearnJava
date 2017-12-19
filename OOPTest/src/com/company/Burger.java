package com.company;

public class Burger {
    private String bread;
    private String meat;
    private String[] addons;

    public Burger(String bread, String meat, String[] addons) {
        if(addons.length > 4){
            System.out.println("You can have a max of 4 addons");
        }else{
            this.bread = bread;
            this.meat = meat;
            this.addons = addons;
        }

    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String[] getAddons() {
        return addons;
    }
}
