package com.smartdata.Smartdata.day_one_date12march;

public class Print_Odd_Number {
    public static void main(String[] args) {
        // Print odd numbers between 1 and 20 using a while loop.
        int number=1;
        while(number <= 20){
            if(number % 2 != 0){
                System.out.println(number);
            }
            number++;
        }
    }
}
