package com.monetize360.cj.basics;
import java.util.*;

public class IsPrime {
    public static boolean check(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i *i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        if(check(num)){
            System.out.println("The entered number " + num + "is a prime number" );
        }
        else{
            System.out.println("The entered number " + num + " is a prime number" );
        }

    }
}
//Time complexity:O(sqrt(N))
//space complexity:O(1)