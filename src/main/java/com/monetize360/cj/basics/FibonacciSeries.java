package com.monetize360.cj.basics;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to the entered number is:");

        int a = 0, b = 1, temp;

        while(a<=n) {
            System.out.print(a + " ");

            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }
}
