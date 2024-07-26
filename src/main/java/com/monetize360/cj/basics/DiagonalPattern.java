package com.monetize360.cj.basics;

import java.util.Scanner;
//problem num 34
public class DiagonalPattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of n for n*n square pattern:");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the value to print at diagonal:");
        int value=sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if(i==j)
                    System.out.print(value+" ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}
