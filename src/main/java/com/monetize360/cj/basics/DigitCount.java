package com.monetize360.cj.basics;
//problem 41

import java.util.Scanner;

public class DigitCount {
    public static int countDigit(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("The number of digits in the entered number is :"+countDigit(n));

    }
}
