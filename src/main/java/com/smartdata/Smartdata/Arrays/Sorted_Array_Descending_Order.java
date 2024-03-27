package com.smartdata.Smartdata.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Sorted_Array_Descending_Order {
    public static void main(String[] args) {

//        //array sorted in descending order using method...
//        Integer[] array = new Integer[]{3,4,1,6,8,5,9,7,2};
//        Arrays.sort(array, Collections.reverseOrder());
//        System.out.println("Array elements in descending order: " +Arrays.toString(array));



        //sorted array in descending order without using method....
        int[] arr = new int[]{3,4,1,6,8,5,9,7,2};
        System.out.println("sorted array in descending order: ");
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                int temp = 0;
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
