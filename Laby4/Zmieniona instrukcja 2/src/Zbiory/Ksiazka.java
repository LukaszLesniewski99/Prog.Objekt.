package Zbiory;

import Zbiory.Zbior;

public class Ksiazka extends Zbior {

    private int strony;

    public Ksiazka(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena, int strony) {
        super(nazwa, autor, dataWydania, wydawnictwo, numerID, cena);
        this.strony = strony;
    }
}
