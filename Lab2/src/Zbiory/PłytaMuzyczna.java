package Zbiory;

import Zbiory.Zbior;

public class PłytaMuzyczna extends Zbior {

    private int dlugosc;
    private String gatunek;

    public PłytaMuzyczna(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena, int dlugosc, String gatunek) {
        super(nazwa, autor, dataWydania, wydawnictwo, numerID, cena);
        this.dlugosc = dlugosc;
        this.gatunek = gatunek;
    }
}
