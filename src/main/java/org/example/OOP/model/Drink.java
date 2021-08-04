package org.example.OOP.model;

public class Drink {
    private DrinkType drinkType;
    private int quantity;

    public Drink(DrinkType drinkType, int quantity) {
        this.drinkType = drinkType;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkType=" + drinkType +
                ", quantity=" + quantity +
                '}';
    }
}
