package com.monetize360.cj.basics;
import java.util.Scanner;
//program 45
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        while (num > 9) {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }
            num=sum;
        }

        System.out.println("Final single-digit sum: " + num);
    }



}
