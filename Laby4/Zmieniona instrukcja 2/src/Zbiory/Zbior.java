package Zbiory;

abstract public class Zbior {

    private String nazwa,autor,dataWydania,wydawnictwo;
    private int numerID,cena;

    public Zbior(String nazwa, String autor, String dataWydania, String wydawnictwo, int numerID, int cena) {
        this.nazwa = nazwa;
        this.autor = autor;
        this.dataWydania = dataWydania;
        this.wydawnictwo = wydawnictwo;
        this.numerID = numerID;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataWydania() {
        return dataWydania;
    }

    public void setDataWydania(String dataWydania) {
        this.dataWydania = dataWydania;
    }

    public String getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwo(String wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public int getNumerID() {
        return numerID;
    }

    public void setNumerID(int numerID) {
        this.numerID = numerID;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
