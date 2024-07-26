package com.monetize360.cj.basics;
import java.util.*;
public class BiggestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number num1 :");
        int num1=sc.nextInt();
        System.out.println("Enter the 2nd number num2 :");
        int num2=sc.nextInt();
        System.out.println("Enter the 1st number num3 :");
        int num3=sc.nextInt();

        //without using any built in functions
        if(num1>=num2 && num1>=num3)
        {
            System.out.println("The biggest number out of the 3 numbers entered is:" + num1);
        }
        else if (num2>=num1 && num2>=num3)
        {
            System.out.println("The biggest number out of the 3 numbers entered is: 4" + num2);
        }
        else
        {
            System.out.println("The biggest number out of the 3 numbers entered is:" + num3);
        }
    }
}
