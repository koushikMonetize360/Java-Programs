package com.monetize360.cj.basics;

import java.util.Scanner;

public class AbsoluteOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num<0)
        num*=-1;
        System.out.println("The result is: "+num);
    }
    
}
