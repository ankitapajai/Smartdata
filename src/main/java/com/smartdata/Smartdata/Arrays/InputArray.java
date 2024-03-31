package com.smartdata.Smartdata.Arrays;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("To enter the size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        //input
        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.print(numbers[i]);
        }
    }
}
