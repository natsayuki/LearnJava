package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println("count value " + count);
            count++;
        }
        count = 0;
        do {
            System.out.println("count" + count);
            count++;
        } while(count != 6);
        int number = 5;
        int finish = 20;
        int counter = 0;
        while (number <= finish && counter < 5){
            if(!isEven(number)){
                number++;
                continue;
            }
            number++;
            counter++;
            System.out.println("is even " + number + " " +  counter  + " even numbers found");
        }
    }
    public static boolean isEven(int num){
        if(num % 2  == 1){
            return false;
        }return true;
    }
}
