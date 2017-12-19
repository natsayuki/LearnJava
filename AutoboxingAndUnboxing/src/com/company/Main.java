package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Integer integer = new Integer(54);
	    Double doubleValue = new Double(2.3);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        for(int i=0; i<11; i++){
            intArrayList.add(Integer.valueOf(i));
        }

        for(int i=0; i<11; i++){
            System.out.println(i + " -> " + intArrayList.get(i).intValue());
        }

        // Easier way

        Integer myIntValue = 56;

        ArrayList<Double> doubleList = new ArrayList<Double>();
        for(double i=0.0; i<10.0; i+=0.5){
            doubleList.add(i);
        }

        for(int i=0; i<doubleList.size(); i++){
            System.out.println(i + " -> " + doubleList.get(i));

        }
    }
}
