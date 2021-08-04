package org.example.OOP.model;

public class Pizza {
    private String rozmiar;
    private String typ;

    public Pizza(String rozmiar, String typ) {
        this.rozmiar = rozmiar;
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "rozmiar='" + rozmiar + '\'' +
                ", typ='" + typ + '\'' +
                '}';
    }
}
