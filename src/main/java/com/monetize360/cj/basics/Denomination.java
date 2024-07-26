package com.monetize360.cj.basics;

import java.util.Scanner;
//program 48
public class Denomination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 4 digit number:");
        int num=sc.nextInt();
        System.out.println(num/1000+"*1000 = "+(num/1000)*1000);
        num=num%1000;
        System.out.println(num/100+"*100 = "+(num/100)*100);
        num=num%100;
        System.out.println(num/10+"*10 = "+(num/10)*10);
        num=num%10;
        System.out.println(num/1+"*1 = "+(num/1)*1);


    }
}
