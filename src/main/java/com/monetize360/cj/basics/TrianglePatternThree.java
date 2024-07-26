package com.monetize360.cj.basics;

import java.util.Scanner;

public class TrianglePatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows for the pattern:");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for(int k=i;k>=1;k--)
                System.out.print(k+" ");
            System.out.println();
        }
    }
}
