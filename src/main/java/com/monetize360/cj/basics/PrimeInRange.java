package com.monetize360.cj.basics;
import java.util.*;
public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the lower bound value:");
        int lowerBound = sc.nextInt();
        System.out.println("Enter the upper bound value:");
        int upperBound = sc.nextInt();

        System.out.println("The prime numbers between " + lowerBound + " and " + upperBound + " are:");
        IsPrime obj=new IsPrime();
        for (int num = lowerBound; num <= upperBound; num++) {
            if (obj.check(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
