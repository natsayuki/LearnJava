package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printList(){
        System.out.println("There are " + groceryList.size() + " items in your list");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modify(String currentItem, String newItem){
        int pos = find(currentItem);
        if(pos >= 0 ){
            modify(pos, newItem);
        }
    }

    private void modify(int pos, String name){
        groceryList.set(pos, name);
        System.out.println("item " + (pos+1) + " has been modified");
    }

    public void remove(String item){
        int pos = find(item);
        if(pos>=0){
            remove(pos);
        }
    }

    private void remove(int pos){
        groceryList.remove(pos);
    }

    private int find(String item){
        return groceryList.indexOf(item);
    }

    public boolean onFile(String item){
        int pos = find(item);
        return pos>=0;
    }
}
