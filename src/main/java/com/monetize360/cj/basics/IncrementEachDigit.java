package com.monetize360.cj.basics;
import java.util.Scanner;
//program49
public class IncrementEachDigit
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();
        int result = 0;
        int mult = 1;

        while (num > 0) {
            int digit = num % 10;
            digit = (digit + 1) % 10; // Increment and handle 9 -> 0
            result += digit * mult;
            mult *= 10;
            num /= 10;
        }

        System.out.println("Incremented number: " + result);
    }
}
