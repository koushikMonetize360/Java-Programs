package com.monetize360.cj.basics;

import java.util.Scanner;
//problem number 36
public class Apattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the size for \"A\" pattern");
        int n=sc.nextInt();
        for(int i=0;i<n*2+1;i++)
        {
            for(int j=0;j<n*2;j++)
            {
                if(i==0 || i==(n*2)/2|| j==0||j==(n*2)-1)
                    System.out.print("@");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
