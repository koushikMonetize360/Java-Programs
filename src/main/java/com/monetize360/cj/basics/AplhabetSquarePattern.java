package com.monetize360.cj.basics;

import java.util.Scanner;

public class AplhabetSquarePattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of n for n*n square pattern:");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        char t='A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(t + " ");
                t+=1;
            }
            System.out.println();
        }
    }
}
