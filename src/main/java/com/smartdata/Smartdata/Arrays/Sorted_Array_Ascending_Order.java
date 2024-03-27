package com.smartdata.Smartdata.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Array_Ascending_Order {
    public static void main(String[] args) {

        //sorted array in ascending order using method(Arrays.sort)....
//        int[] arr = new int[]{3,4,1,6,8,5,9,7,2};
//        Arrays.sort(arr);
//        System.out.println("Array are sort in ascending order: ");
//
//        for(int i=0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }


        // Array are sort without using (Arrays.sort)method...
        int[] array = new int[]{3,4,1,6,8,5,9,7,2};
        for(int i=0; i< array.length; i++){
            for(int j=i+1; j< array.length; j++){
                int temp =0;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
