package com.monetize360.cj.basics;

import java.util.Scanner;

public class BillingByMembership {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bill amount:");
        int amount=sc.nextInt();
        System.out.println("Do you have the membership card?");
        String c=sc.next();
        if(c=="Y")
        {
            double net=  (amount- amount*0.1);
            System.out.println("Thank you! Your total bill amount is"+amount+"discount is Rs"+amount*0.1+"and net payable is RS"+net);
        }
       else{
         double net=amount- amount*0.03;
            System.out.println("Thank you! Your total bill amount is "+amount+" discount is Rs"+amount*0.03+" and net payable is RS"+net);
       }
    }
}
