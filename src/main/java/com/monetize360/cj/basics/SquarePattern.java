package com.monetize360.cj.basics;
import java.util.*;
public class SquarePattern {
    public static void main(String[] args) {
        System.out.println("Enter the value of n for n*n square pattern:");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int t=1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
    }
}
