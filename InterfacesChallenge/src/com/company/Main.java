package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);

        tim.setWeapon("Stormbringer");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("choose\n1 to enter a string\n0 to quit");
        while(!quit){
            System.out.println("choose an option");
            int choice = scanner.nextInt();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("saving " + objectToSave.write().get(i));
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values =  readValues();
        objectToLoad.read(values);
    }
}
