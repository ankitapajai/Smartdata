package com.smartdata.Smartdata.Others_Important;

public class Average_Of_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum  += arr[i];
        }

        System.out.println("sum is: " +sum);
        int avg = sum/ arr.length;
        System.out.println("average is: " +avg);
    }
}
