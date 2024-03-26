package com.smartdata.Smartdata.Others_Important;

import java.util.Arrays;

public class Smallest_Number {
    public static void main(String[] args) {
        int[] arr = {22, 3, 8, 5, 19}; // Example array
        int result = SmallestNumber(arr);
        System.out.println("smallest number: " + result);
    }

    public static int SmallestNumber(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);

        return arr[0];

    }
}
