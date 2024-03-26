package com.smartdata.Smartdata.Others_Important;


import java.sql.Array;
import java.util.Arrays;

public class Sum_Of_Two_Smallest_Number {
    public static void main(String[] args) {
        int[] arr = {22, 7, 8, 2, 19}; // Example array
        int sum = sumOfTwoMinNumbers(arr);
        System.out.println("Sum of the two minimum numbers in the array: " + sum);
    }

    public static int sumOfTwoMinNumbers(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        return arr[0] + arr[1];

    }
}
