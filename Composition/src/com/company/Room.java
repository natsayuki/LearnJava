package com.company;

public class Room {
    private Chair chair;
    private Table table;
    private Person person;

    public Room(Chair chair, Table table, Person person) {
        this.chair = chair;
        this.table = table;
        this.person = person;
    }

    public void whatisthepersonsname(){
        System.out.println("The person's name is " + person.getName());
    }

    public void howmanylegsdoesthetablehave(){
        System.out.println("The table has " + table.getLegs() + " legs");
    }

    public void howmanylegsdoesthechairhave(){ System.out.println("The chair has " + chair.getLegs() + " legs"); }
}
