package org.example.OOP.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Order {

    private List<Pizza> pizza = new LinkedList<>();
    private List<Hamburger> hamburger = new LinkedList<>();
    private List<Drink> drink = new LinkedList<>();
    private List<Client> client = new LinkedList<>();




    public void addPizza(Pizza pizza){
        this.pizza.add(pizza);
    }
    public void addClient(Client client){
        this.client.add(client);
    }
    public void addDrink(Drink drink){
        this.drink.add(drink);
    }
    public void addHamburger(Hamburger hamburger){
        this.hamburger.add(hamburger);
    }

    @Override
    public String toString() {
        return "Order{" +
                "pizza=" + pizza +
                ", hamburger=" + hamburger +
                ", drink=" + drink +
                ", client=" + client +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(pizza, order.pizza) && Objects.equals(hamburger, order.hamburger) && Objects.equals(drink, order.drink) && Objects.equals(client, order.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizza, hamburger, drink, client);
    }
}
