package com.smartdata.Smartdata.Swapping;

public class Swap_Two_Number {
    //Swap of two number without using third variable.....
    //there are two ways to swap two number without using third variable
    // 1. Bitwise XOR (^)
    // 2. addition and subtraction

    // 1. bitwise XOR (^)
    public static void main(String[] args) {

        //define two number
        int a = 5;
        int b = 10;

        System.out.println("Before Swapping a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping a = " + a + " b = " + b);

        System.out.println(" ");

        //2nd method
        //addition and subtraction
        int c = 20;
        int d = 25;

        System.out.println("Before Swapping c = " + c + " d = " + d);
        c = c + d;  // a = a + b;
        d = c - d;  // b = a - b;
        c = c - d;  // a = a - b;
        System.out.println("After Swapping c = " + c + " d = " + d);
    }
}
