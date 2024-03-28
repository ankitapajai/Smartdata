package com.smartdata.Smartdata.Arrays;

public class Right_Rotate_Array {
    public static void main(String[] args) {
        //right rotate of array.....

        int[] array = new int[]{1,2,3,4,5};
        int n = 2;
        System.out.println("Given array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(" " +array[i]);
        }

        for(int i=0; i<n; i++){
            int j,last;
            last = array[array.length-1];

            for(j= array.length-1; j>0; j--){
                array[j] = array[j-1];
            }
            array[0] = last;
        }

        System.out.println(" ");
        System.out.println("After right rotation: ");
        for(int i=0; i< array.length; i++){
            System.out.print(" " +array[i]);
        }
    }
}
