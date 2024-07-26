package com.monetize360.cj.basics;
import java.util.*;
public class OddSeriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n:");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("The series is: ");
        for (int i = 1; i <= n; i+=2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum of the series is: " + sum);
    }
}
