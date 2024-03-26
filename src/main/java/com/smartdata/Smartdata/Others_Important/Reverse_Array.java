package com.smartdata.Smartdata.Others_Important;


public class Reverse_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("original array: ");
        for(int i=0; i< array.length; i++){
            System.out.print("" +array[i]);
        }
        System.out.println(" ");
        System.out.println("Array in reverse order: ");
        for(int i= array.length-1; i >= 0; i--){
            System.out.print("" +array[i]);
        }
    }
}
