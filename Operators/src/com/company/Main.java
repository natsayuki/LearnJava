package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;

        // operator: +, -, /, *

        int myInt = 4 % 3;
        // modulo and ++ and +=

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;

        if(topScore == 100)
            System.out.println("you've got the top score");

        // talks about and operator and greater than / less than and equals etc


        // Ternary. This is new to me. Syntax: newValue = falseValue ? false : true;
        // This ^ line of code above means that if the false value is false, the new value is true
        boolean isCar = false;
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("was car is true");
        }

        // challenge

        double num = 20d;
        double numTwo = 80d;
        double newSum = (num + numTwo) * 25d;
        double remainder = newSum % 40d;
        if(remainder <= 20d){
            System.out.println("total too big" + remainder);
        }
    }
}
