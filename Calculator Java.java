package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            case '%':
                result = num1 % num2;
                break;

            default:
                System.out.println("Error! operator is not correct");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}