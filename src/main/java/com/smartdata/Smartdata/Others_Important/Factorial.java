package com.smartdata.Smartdata.Others_Important;

public class Factorial {
    public static void main(String[] args) {
        int n=6;
        int mul=1;
        while(n>0){
            mul=mul*n;
            n--;
        }
        System.out.println(mul);

    }
}
