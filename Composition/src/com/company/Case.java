package com.company;

public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensoins;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensoins) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensoins = dimensoins;
    }

    public void pressPowerButotn(){
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensoins() {
        return dimensoins;
    }
}
