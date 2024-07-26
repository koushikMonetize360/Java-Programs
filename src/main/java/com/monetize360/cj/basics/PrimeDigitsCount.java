package com.monetize360.cj.basics;
import java.util.Scanner;
//problem 46
public class PrimeDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int count = 0;
        IsPrime obj=new IsPrime();

        while (num > 0) {
            int digit = num % 10;
            if (obj.check(digit)) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Number of prime digits in the entered number is " + count );
    }
}
