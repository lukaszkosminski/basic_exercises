package org.example.OOP.model;

public class Hamburger {
   private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Hamburger(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "size='" + size + '\'' +
                '}';
    }
}
