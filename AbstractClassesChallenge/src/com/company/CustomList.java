package com.company;

import java.util.LinkedList;

public class CustomList {
    private LinkedList<CustomListItem> list = new LinkedList<>();

    public void addItem(CustomListItem item, int index){
        boolean add = false;
        for(int i=0; i<this.list.size()-1; i++){
            if(this.list.get(i) == item){
                System.out.println("item already in list you dingus");
                break;
            }
            else{
                add = true;
            }
        }
        if(add) {
            this.list.add(item);
        }
    }
    public CustomListItem getPrevious(CustomListItem item){
        int index = -1;
        for(int i=0; i<this.list.size()-1; i++){
            if(this.list.get(i) == item){
                index = i;
                break;
            }
        }
        if(index >= 0){
            return this.list.get(index);
        }
        return this.list.get(index + 1);
    }

    public CustomListItem getNext(CustomListItem item){
        int index = 0;
        for(int i=0; i<this.list.size()-1; i++){
            if(this.list.get(i) == item){
                index = i + 1;
                break;
            }
        }
        if(index >= 0){
            return this.list.get(index);
        }
        return this.list.get(index - 1);
    }
    public int compareTo(CustomListItem one, CustomListItem two){
        int indexOne = 0;
        int indexTwo = 0;
        for(int i = 0; i<this.list.size(); i++){
            if(this.list.get(i) == one){
                indexOne = i;
            }
            else if(this.list.get(i) == two){
                indexTwo = i;
            }
        }
        return indexOne - indexTwo;
    }

    public boolean remove(CustomListItem item){
        for(int i=0; i<this.list.size(); i++){
            if(this.list.get(i) == item){
                this.list.remove(i);
                return true;
            }
        }
        return false;
    }
}
