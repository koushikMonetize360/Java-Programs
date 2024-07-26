package com.monetize360.cj.basics;

import java.util.Scanner;
//program 43
public class ReverseOfNumber {
    public static int reverse(int num)
    {
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n=sc.nextInt();
        System.out.println("The reverse of  the entered number is :"+reverse(n));

    }
}
