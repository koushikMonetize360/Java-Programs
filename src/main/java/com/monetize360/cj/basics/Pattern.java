package com.monetize360.cj.basics;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("pattern:");
        for (int i = 1; i <= 7; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.println("            *         *");
        }
        for (int i = 1; i <= 12; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 1; i <= 3; i++) {
            System.out.println("*           *");
        }
        System.out.print("            ");
        for (int i = 1; i <= 7; i++) {
            System.out.print("* ");
        }
    }
}
