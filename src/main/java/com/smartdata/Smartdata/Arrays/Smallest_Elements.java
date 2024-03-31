package com.smartdata.Smartdata.Arrays;

public class Smallest_Elements {
    public static void main(String[] args) {

        int[] numbers = new int[]{25,11,7,75,56};
        int min = numbers[0];
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println("Smallest elements in the given array: " +min);
    }
}
