package com.monetize360.cj.basics;

import java.util.Scanner;

public class GradeByMarks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks scored in subject1 :");
        int s1=sc.nextInt();
        System.out.println("Enter the marks scored in subject2 :");
        int s2=sc.nextInt();
        System.out.println("Enter the marks scored in subject3 :");
        int s3=sc.nextInt();
        System.out.println("The total marks scored :"+(s1+s2+s3));
        double avg=(s1+s2+s3)/3.0;
        System.out.println("Average is: "+avg);
        System.out.print("Grade:");
        if(avg>60)
        {
            System.out.println("A");
        }
       else if(avg>35){
        
            System.out.println("B");
       }
       else
       System.out.println("C");
    }
}
