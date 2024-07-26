package com.monetize360.cj.basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        //using bit manpulation
        if((num & 1)==1)
        System.out.println("The entered number "+num+" is odd");
        else
        System.out.println("The entered number "+num+" is even");
    }
}
