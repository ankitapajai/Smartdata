package com.smartdata.Smartdata.Arrays;

import java.util.Scanner;

public class Find_Position_In_Array {
    public static void main(String[] args) {

        //write a program to find the position in an array.....
        int[] arr = new int[]{10,20,30,40,70,80,90,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element that you want to search: ");
        int m = sc.nextInt();
                int position = -1;

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == m) {
                        position = i;
                        break; // Stop searching once the element is found
                    }
                }

                if (position != -1) {
                    System.out.println("Element found at position: " + position);
                } else {
                    System.out.println("Element not found in the array.");
                }
    }
}

