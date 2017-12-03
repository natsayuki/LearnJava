package com.company;

public class Main {

    public static void main(String[] args) {
        for( int i=8; i>1; i--){
            System.out.println(calculate(10000, i));
        }

        int count  = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i) && count < 3){
                count++;
                System.out.println("primr"+i);
            }
        }
    }
    public static double calculate(double amount, double rate){
        return amount * (rate/100);
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; 1<=n/2; i++){
            if( n % i == 0){
                return false;
            }
        }return true;
    }
}
