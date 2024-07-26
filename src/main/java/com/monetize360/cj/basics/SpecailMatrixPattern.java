package com.monetize360.cj.basics;
import java.util.Scanner;

//problem num 39
public class SpecailMatrixPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print((j + i + 1) % n + 1 + " ");
            }
            System.out.println();
        }
    }
}
