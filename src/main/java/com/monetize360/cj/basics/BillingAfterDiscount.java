package com.monetize360.cj.basics;

import java.util.Scanner;

public class BillingAfterDiscount {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("Enter the billing amount:");
       int amount=sc.nextInt();
       if(amount>6000)
       {
         amount-=(amount*0.1);
       }
       System.out.println("Your net billinng amount is: "+amount);
    }
}
