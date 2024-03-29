package com.smartdata.Smartdata.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element_Last {
    public static void main(String[] args) {
        //insert elements at last position in an array.....
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements: ");
        int m = sc.nextInt();

        int newArr[] = new int[arr.length+1];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i< arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = m;
        System.out.println(Arrays.toString(newArr));
    }
}
