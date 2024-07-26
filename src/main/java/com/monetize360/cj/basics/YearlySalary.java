package com.monetize360.cj.basics;


import java.text.DecimalFormat;
import java.util.Scanner;

public class YearlySalary {
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the empno:");
       int empno=sc.nextInt();
       sc.nextLine();
       System.out.println("Enter the employee name:");
       String name=sc.nextLine();
       System.out.println("Enter the monthly salary:");
       int salary_month=sc.nextInt();

        DecimalFormat formatter = new DecimalFormat("#,###,###");
        String formattedNumber = formatter.format((salary_month*12));
       System.out.println("Hi "+name+" Your employee id is "+empno+", monthly salary is: "+salary_month+" and yearly salary is Rs "+ formattedNumber);


    }
}
