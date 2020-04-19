package Zbiory;

import Zbiory.Zbior;

public class Filmy extends Zbior {

   private int dlugosc;
   private String gatunek,reżyser;

    public Filmy(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena, int dlugosc, String gatunek, String reżyser) {
        super(nazwa, autor, dataWydania, wydawnictwo, numerID, cena);
        this.dlugosc = dlugosc;
        this.gatunek = gatunek;
        this.reżyser = reżyser;
    }
}
