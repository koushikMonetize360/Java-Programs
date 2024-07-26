package com.monetize360.cj.basics;
import java.util.*;
//program44
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int result = 0;
        int n = (int) Math.log10(num) + 1;

        while (temp != 0) {
            int rem = temp % 10;
            result += Math.pow(rem, n);
            temp /= 10;
        }

        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
