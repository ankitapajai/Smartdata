package com.smartdata.Smartdata.Arrays;

public class Largest_Element {
    public static void main(String[] args) {

        //find the largest elements in an array.....

        int[] arr = new int[]{25,11,7,75,56};
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest elements in the given array: " +max);
    }
}
