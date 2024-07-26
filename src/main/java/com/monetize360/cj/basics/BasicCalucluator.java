package com.monetize360.cj.basics;
import java.util.Scanner;
//program 52

public class BasicCalucluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Operand num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd Operand num2: ");
        int num2 = sc.nextInt();

        System.out.println("1. add 2.sub 3. mul 4. div 5. mod ");
        System.out.print("Enter the operator: ");
        int operator = sc.nextInt();

        int result = 0;

        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " and " + num2 + " is " + result);
                }
                break;
            case 5:
                if (num2 == 0) {
                    System.out.println("Modulus by zero is not allowed.");
                } else {
                    result = num1 % num2;
                    System.out.println("The modulus of " + num1 + " and " + num2 + " is " + result);
                }
                break;


            default:
                System.out.println("Invalid operator");
        }
    }
}
