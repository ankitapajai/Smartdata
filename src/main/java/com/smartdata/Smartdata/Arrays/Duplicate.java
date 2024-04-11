package com.smartdata.Smartdata.Arrays;

public class Duplicate {
    public static void main(String[] args) {

        //find the duplicate number in an array....

        int[] arr1 = {1,2,2,3,4,4,5,6,6};
        System.out.println("Duplicate number in given array: ");
        for(int i=0; i<arr1.length; i++){
            for(int j=i+1; j<arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    System.out.println(arr1[j]);
                }
            }
        }
    }
}

