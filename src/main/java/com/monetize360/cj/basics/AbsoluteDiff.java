package com.monetize360.cj.basics;

import java.util.Scanner;

public class AbsoluteDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int n1=sc.nextInt();
        System.out.println("enter the num2:");
        int n2=sc.nextInt();
        int result=0;
        //alterante approach is to Math.abs()(bulitin function)
        if(n1>n2)
         result=n1-n2;
        else
         result=n2-n1;
        System.out.println("The result is(diff) "+result);
    }
}
