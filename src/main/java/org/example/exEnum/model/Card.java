package org.example.exEnum.model;

public class Card {
   private Suit suit;
    private Rank rank;

    public void printDescription(){
        System.out.println(rank+"-"+suit);
    }

    public  Card(String suit, String rank) {
        this.suit = Suit.valueOf(suit);
        this.rank = Rank.valueOf(rank);
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
