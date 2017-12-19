package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static GroceryList list = new GroceryList();

    public static void main(String[] args) {
	    boolean quit = false;
	    int choice = 0;
	    printInstructions();
	    while(!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    list.printList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list");
        System.out.println("\t 2 - To add an item");
        System.out.println("\t 3 - To modify an item");
        System.out.println("\t 4 - To remove an item");
        System.out.println("\t 5 - To search for an item");
        System.out.println("\t 6 - To quit");
    }

    public static void addItem(){
        System.out.print("Please enter an item");
        list.addItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.println("Enter current item name");
        String no = scanner.nextLine();
        System.out.print("Enter replacement item ");
        String newItem = scanner.nextLine();
        list.modify(no, newItem);
    }

    public static void removeItem(){
        System.out.println("Enter item");
        String no = scanner.nextLine();
        scanner.nextLine();
        list.remove(no);
    }

    public static void searchItem(){
        System.out.print("Item ot search for");
        String item = scanner.nextLine();
        if(list.onFile(item)){
            System.out.println("Found " + item + " in list");
        } else{
            System.out.println(item + " is not in list");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(list.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(list.getGroceryList());

        String[] myArray = new String[list.getGroceryList().size()];
        myArray = list.getGroceryList().toArray();

    }
}
