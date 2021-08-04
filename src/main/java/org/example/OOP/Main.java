package org.example.OOP;

import org.example.OOP.model.*;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(new Client("Mirek",
                "Lakowa 2a",
                "123456789"), (new Pizza("duza","peperoni")),new Drink(DrinkType.JUICE,2));

        Order order2 = new Order(new Client("Krysia","Nadrzeczna 6/3", "12354889"),
                new Pizza("mala","hawajska"),
                new Pizza("srednia","capriciosa"),
                new Drink(DrinkType.COLA,1));
    }
}
