package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] nums = getNums(5);
        Arrays.sort(nums);
        int[] end = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            end[i] = nums[(nums.length-i)-1];
        }
        for(int i=0; i<nums.length; i++){
            System.out.println(end[i]);
        }
    }

    public static int[] getNums(int amount){
        int[] nums = new int[amount];
        System.out.println("enter " + amount + " numbers\r");
        for(int i=0; i<amount; i++){
            nums[i] = scanner.nextInt();
        }
        return nums;
    }
}
