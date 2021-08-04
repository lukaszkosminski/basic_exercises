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

    }
}
