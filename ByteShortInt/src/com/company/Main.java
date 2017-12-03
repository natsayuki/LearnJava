package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByte = 5;
        short myShort = 5;
        int myInt = 5;
        long myLong = 5000L + myByte * 10L + myShort + myInt;
        System.out.println(myLong);
    }
}
