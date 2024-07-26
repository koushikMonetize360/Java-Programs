package com.monetize360.cj.basics;

import java.util.Scanner;

public class MembershipRegistration {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println("enter the mobile no:");
        Long num=sc.nextLong();
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("Sorry! You need to be at least 18 years old to get membership.");
        }
        else
        {
            System.out.println("Congratulations "+name +" for your successful registration");
        }
    }
}
