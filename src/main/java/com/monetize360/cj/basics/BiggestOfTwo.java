package com.monetize360.cj.basics;

import java.util.Scanner;

public class BiggestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num1:");
        int n1=sc.nextInt();
        System.out.println("enter the num2:");
        int n2 =sc.nextInt();
        //without using built it in funcitons
        System.out.println("The biggger num is "+(n1>n2? n1:n2));


    }
}
