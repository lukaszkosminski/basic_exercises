/*
Napisz prosty program z metodą, która przyjmuje parametr typu String i zwraca typ char. Metoda pobiera pierwszą literę napisu z parametru i zwraca ją (jako typ char). Wartość parametru (napis) pobieraj z klawiatury.

Skorzystaj z tej metody i wypisz wynik w postaci: parametr - pierwszaLitera

np.
Adam - A,
rower - r

Przetestuj działanie dla kilku przykładowych wartości.
 */
package org.example.JavaSE;

import java.util.Scanner;

public class Ex1 {

    static String word;
    static char firstLetter;

    public static void main(String[] args) {

        word = stringFromTerminal();
        firstLetter = stringToChar(word);
        System.out.println(word + "-" + firstLetter);
    }

    public static char stringToChar(String word) {
        return word.charAt(0);
    }

    public static String stringFromTerminal() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
