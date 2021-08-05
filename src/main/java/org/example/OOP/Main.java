/*
Zaprojektuj aplikację dla małej Pizzerii (obsługa telefonicznych zamówień od klientów).


Menu

pizza (mała, średnia, duża) 🍕
hamburger 🍔
napoje (cola, sok, piwo) 🍺
Typ pizzy: Pepperoni, Capricciosa, Hawajska, itp.


Zamówienie

klient (imię) / adres / telefon
rodzaj zamówienia (pizza (rozmiar/typ) / hamburger + napoje)
Wyobraź sobie teraz taką sytuację:

Dzwoni klient: Mirek z ulicy Łąkowej 2A i zamawia dużą pizzę Pepperoni oraz 2 opakowania soku.
Dzwoni kolejny klient: Krysia z ulicy Nadrzecznej 6/3 i zamawia małą pizzę Hawajską, średnią Capriciosę oraz colę.
Dzwoni kolejny klient: Damian z ulicy Polnej 13 i zamawia hamburgera oraz piwo.
Wprowadź do swojej aplikacji powyższe zamówienia (zakodować w metodzie main, nie trzeba wprowadzać z konsoli).



Uwagi do rozwiązania:

aplikacja powinna być napisana obiektowo (klasy np. Pizza, Drink, Order, Client itd.),
przynajmniej jeden rodzaj obiektu powinien być tworzony za pomocą konstruktora,
w przynajmniej jednej klasie zaimplementuj metody equals() i hashCode(),
w programie powinna się znaleźć przynajmniej jedna klasa Enum (np. PizzaSize),
klasy, metody i pola powinny mieć odpowiednie modyfikatory dostępu (public/private).
Za wykonanie powyższych poleceń można dostać maksymalną liczbę punktów.


Dla chętnych:

każde zamówienie zostaje zapisane do pliku w formacie JSON
 */


package org.example.OOP;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import org.example.OOP.model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        order1.addClient(new Client("Mirek","Lakowa 2A","112434"));
        order1.addPizza(new Pizza("duza","peperoni"));
        order1.addDrink(new Drink(DrinkType.JUICE,2));

        Order order2 = new Order();
        order2.addClient(new Client("Krysia", "Nadrzeczna 63", "34234234"));
        order2.addPizza(new Pizza("mala", "hawajska"));
        order2.addPizza(new Pizza("srednia","capriciosa"));
        order2.addDrink(new Drink(DrinkType.COLA,1));

        Order order3 = new Order();
        order3.addClient(new Client("Dominik", "Polna 13","874687496"));
        order3.addHamburger(new Hamburger("mid"));
        order3.addDrink(new Drink(DrinkType.BEER,1));

        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

        List <Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);

        try {
            Writer writer = new FileWriter("order_json");
            Gson gson = new GsonBuilder().create();
            gson.toJson(orders,writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("czy order1 jest taki sam jak order2? :" +order1.equals(order2));
        System.out.println("hashcode order1: " + order1.hashCode());
        System.out.println("hashcode order2: " + order2.hashCode());

    }
}
