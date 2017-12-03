package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch beast", "acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("bj-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        Room room = new Room(new Chair(4), new Table(4), new Person("bill"));

        room.whatisthepersonsname();
        room.howmanylegsdoesthechairhave();
        room.howmanylegsdoesthetablehave();
    }
}
