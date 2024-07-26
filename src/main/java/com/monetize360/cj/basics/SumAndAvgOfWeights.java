package com.monetize360.cj.basics;

import java.util.*;

class SumAndAvgOfWeights {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight of the first person:");
        double w1=sc.nextDouble();
        System.out.println("Enter the weight of the second person:");
        double w2=sc.nextDouble();
        System.out.println("Enter the weight of the third person:");
        double w3=sc.nextDouble();
        System.out.println("The sum of weight of the 3 persons is " +(w1+w2+w3)+" Kgs and the average weight is " +(w1+w2+w3)/3+" Kgs");

  }
  }