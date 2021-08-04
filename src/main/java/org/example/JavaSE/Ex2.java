package org.example.JavaSE;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        System.out.println("enter first number: ");

        Scanner scanner = new Scanner(System.in);
        double value1 = scanner.nextInt();

        System.out.println("enter second number: ");
        double value2 = scanner.nextInt();

        System.out.println("enter a math symbol ( +, -, *, / ): ");
        String symbol = scanner.next();

        switch (symbol) {
            case "+": {
                double result = value1 + value2;
                System.out.println("result: " + result);
                break;
            }

            case "-": {
                double result = value1 - value2;
                System.out.println("result: " + result);
                break;
            }

            case "*": {
                double result = value1 * value2;
                System.out.println("result: " + result);
                break;
            }

            case "/": {
                if (value2 == 0) {
                    System.out.println("don't divide by zero");
                    break;
                }

                double result = value1 / value2;

                System.out.println("result: " + result);
                break;
            }

            default: {
                System.out.println("invalid math symbol!");
            }
        }
    }
}
