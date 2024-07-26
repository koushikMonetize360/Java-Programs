package com.monetize360.cj.basics;

import java.util.Scanner;

public class NaturalNumGenerator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of natural numbers to be generated:");
        int num1=sc.nextInt();
        System.out.print("First "+num1+" natural numbers are: ");
        for(int i=1;i<=num1;i++)
        {
            System.out.print(i+" ");
        }
      
        
    }
}
