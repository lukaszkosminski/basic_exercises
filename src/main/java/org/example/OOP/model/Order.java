package org.example.OOP.model;

import java.util.Objects;

public class Order {
    Client client;
    Pizza pizza;
    Drink drink;
    Hamburger hamburger;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(client, order.client) && Objects.equals(pizza, order.pizza) && drink == order.drink && Objects.equals(hamburger, order.hamburger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, pizza, drink, hamburger);
    }

    public Order(Client client, Pizza pizza, Drink drink) {
        this.client = client;
        this.pizza = pizza;
        this.drink = drink;
    }

    public Order(Client client, Drink drink, Hamburger hamburger) {
        this.client = client;
        this.drink = drink;
        this.hamburger = hamburger;
    }

}
