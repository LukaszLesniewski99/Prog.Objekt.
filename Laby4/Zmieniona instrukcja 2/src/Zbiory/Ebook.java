package Zbiory;

public class Ebook extends Ksiazka {

    private int rozmiar;

    public Ebook(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena, int strony, int rozmiar) {
        super(nazwa, autor, dataWydania, wydawnictwo, numerID, cena, strony);
        this.rozmiar = rozmiar;
    }
}
