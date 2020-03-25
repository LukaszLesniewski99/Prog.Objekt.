package Zbiory;

import Zbiory.Zbior;

public class Audiobook extends Zbior {

    private int dlugosc,rozmiar;
    private String lektor;

    public Audiobook(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena, int dlugosc, int rozmiar, String lektor) {
        super(nazwa, autor, dataWydania, wydawnictwo, numerID, cena);
        this.dlugosc = dlugosc;
        this.rozmiar = rozmiar;
        this.lektor = lektor;
    }
}
