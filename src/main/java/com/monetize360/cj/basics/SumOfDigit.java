package com.monetize360.cj.basics;

import java.util.Scanner;

public class SumOfDigit {
    public static int findSum(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("The sum of digits in the entered number is :"+findSum(n));

    }
}
