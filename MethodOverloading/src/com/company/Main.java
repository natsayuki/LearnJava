package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(convert(6, 0));
        System.out.println(convert(132));
    }
    public static double convert(double feet, double inches){
        if(feet >= 0 && inches <= 12){
            inches = inches + (12 * feet);
            return inches * 2.54;
        }return -1;
    }
    public static double convert(double inches){
        return convert( (int) (inches) / 12, (int)(inches) % 12 );
    }
}
