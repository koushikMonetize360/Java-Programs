package com.monetize360.cj.basics;

import java.util.Scanner;

public class NumberSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1:");
        int num1=sc.nextInt();
        System.out.println("enter the number 2:");
        int num2=sc.nextInt();
        System.out.println("Before swap the values of num1="+num1+" the value of num2="+num2);
        //swapint without using a variable
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swap the values of num1="+num1+" the value of num2="+num2);


    }
}
