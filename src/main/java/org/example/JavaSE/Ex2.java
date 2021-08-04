/*
Stwórz prosty kalkulator, który pobiera od użytkownika (z klawiatury) dwie dowolne liczby oraz symbol działania (+, -, *, /).
Kalkulator powinien wyświetlić poprawny wynik dla podanych parametrów.

np.:
Podaj pierwszą liczbę:
12
Podaj drugą liczbę:
4
Podaj symbol działania (+,-,*,/):
/
Wynik działania: 12 / 4 = 3


Przetestuj działanie swojego kalkulatora dla różnych operacji matematycznych.
 */

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
