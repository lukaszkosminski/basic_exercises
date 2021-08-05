/*
Celem zadania jest utrwalenie wiedzy o typach wyliczeniowych w javie (enum).


Prosta karcianka

stwórz dwie klasy enum określające kolor i figurę karty:
- Suit (CLUBS, DIAMONDS, HEARTS, SPADES)
- Rank (ACE, KING, QUEEN, JACK)
stwórz klasę o nazwie Card z dwoma polami (typy Suit i Rank)
w klasie Card dodaj metodę printDescription(), która wypisuje na ekran opis karty w formacie “figura – kolor”, np. “Ace – Spades”
utwórz kilka obiektów klasy Card i wywołaj na nich metodę printDescription()
(opcja dla chętnych) kolor i figurę pobieraj z klawiatury
uruchom i przetestuj aplikację

Uwagi do rozwiązania:

aplikacja powinna być napisana obiektowo (klasa Card, enumy Suit i Rank),
obiekty typu Card powinny być tworzone za pomocą konstruktora,
klasy, metody i pola powinny mieć odpowiednie modyfikatory dostępu (public/private).
Za wykonanie powyższych poleceń można dostać maksymalną liczbę punktów.

 */

package org.example.exEnum;

import org.example.exEnum.model.Card;
import org.example.exEnum.model.Rank;
import org.example.exEnum.model.Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witamwy gra w karty");
        prepare();


    }public static void prepare(){
        try{
        System.out.println("podaj range karty (ACE, KING, QUEEN, JACK)");
        String rank = scan();
        System.out.println("podaj range rodzaj (CLUBS, DIAMONDS, HEARTS, SPADES)");
        String suit = scan();
        Card card = new Card(suit,rank);
        card.printDescription();
    }catch (IllegalArgumentException e){
            System.out.println("niepoprawne dane");
            prepare();
        }}

    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        return value;
    }
}
