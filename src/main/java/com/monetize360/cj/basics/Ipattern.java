package com.monetize360.cj.basics;

import java.util.Scanner;
//problem num 35
public class Ipattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for the pattern:");
        int n=sc.nextInt();
        for(int i=0;i<n*2+1;i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=0;i<n*2+1;i++){
            System.out.print("*");
        }



    }
}
