package com.company;

public class Motherboard {
    private String model;
    private String manufactorer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufactorer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactorer = manufactorer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufactorer() {
        return manufactorer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }


}
