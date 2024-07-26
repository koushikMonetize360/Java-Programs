package com.monetize360.cj.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        int amount=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        double interest=sc.nextDouble();
        System.out.println("Enter the time in years:");
        int time=sc.nextInt();
        System.out.println("simple interest is "+(amount*time*interest)/100.0);
    }
}
