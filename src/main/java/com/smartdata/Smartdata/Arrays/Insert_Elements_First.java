package com.smartdata.Smartdata.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Elements_First {
    public static void main(String[] args) {

        //insert elements in an array......
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int m = sc.nextInt();

        int newArr[] = new int[arr.length+1];
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length; i++) {
            newArr[i+1] = arr[i];
        }
        newArr[0] = m;
        System.out.println(Arrays.toString(newArr));
    }
}
