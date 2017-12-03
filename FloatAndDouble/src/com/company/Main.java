package com.company;

public class Main {

    public static void main(String[] args) {
        // iwdth of int is 32(4 bytes)
	    int myIntValue = 5 / 3;
	    // width of float is 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
	    // width of souble is 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;
        System.out.println("myINtValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        // pounds to kilograms
        double pounds = 200d;
        double toKilo = (double)(pounds)*0.45359237d;
        System.out.println(toKilo);

    }
}

