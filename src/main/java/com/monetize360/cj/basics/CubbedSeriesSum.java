package com.monetize360.cj.basics;
import java.util.Scanner;
//problem num24
public class CubbedSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n:");
        int n = sc.nextInt();

        double sum = 0.0;
        for (long i = 1; i <= n; i++) {
            sum += 1.0 / (i*i*i);
        }

        System.out.println("The sum of the series  is: " + sum);
    }
}
