package com.monetize360.cj.basics;
import java.util.Scanner;
//program 47
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp=num;
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;
            while (num > 0) {
                factorial *= num;
                num--;
            }
            System.out.println("Factorial of " + temp + " is: " + factorial);
        }
    }
}
