package org.example.OOP.model;

public class Client {

    private String imie;
    private String adres;
    private String telefon;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Client(String imie, String adres, String telefon) {
        this.imie = imie;
        this.adres = adres;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Client{" +
                "imie='" + imie + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
