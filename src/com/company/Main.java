package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);

        System.out.println("Enter the which Fibonacci sequence position you want to see: ");
        int position = nums.nextInt();

        int[] numbers = new int[position];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i < position; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
        }

        System.out.println("Your number is " + numbers[position-1]);

    }
}
