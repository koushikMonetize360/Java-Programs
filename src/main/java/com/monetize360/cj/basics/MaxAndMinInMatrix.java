package com.monetize360.cj.basics;

import java.util.*;
//qn num 38
public class MaxAndMinInMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of n*n Matrix");
        int n=sc.nextInt();
        int ar[][]=new int[n][n];
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        long sum=0;
        System.out.println("Enter the elements in to the Matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=sc.nextInt();
                sum+=ar[i][j];
                max=Math.max(max,ar[i][j]);
                min=Math.min(min,ar[i][j]);
            }
        }
        System.out.println("The maximum element is "+max+", the Minimum element is "+min+", the sum of matrix is "+sum);
    }
}
