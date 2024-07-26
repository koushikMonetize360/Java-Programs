package com.monetize360.cj.basics;
import java.util.Scanner;
//program50
public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(m + "^" + n + " = " + power(m, n));
    }

    public static int power(int m, int n) {
        if (n == 0) {
            return 1;
        }
        int temp = power(m, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return m*temp*temp;
        }
    }

}
