package com.monetize360.cj.basics;
//program 54
public class SeriesSumTwo {
    public static void main(String[] args) {
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= 7; i++) {
            factorial *= i;
            sum += (double) i / factorial;
        }

        System.out.println("Sum of the series: " + sum);
    }
}
