package com.monetize360.cj.basics;
import java.util.*;
public class DescNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of natural numbers to be generated:");
        int num = scanner.nextInt();

        System.out.println("The first " + num + " natural numbers in descending order are:");

        for (int i = num; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
