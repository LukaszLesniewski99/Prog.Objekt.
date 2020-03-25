package użytkownik;

import Zbiory.Zbior;

import java.util.ArrayList;

public class uzytkownik {

    private String imie,nazwisko,adres,dataZapisu;
    private int wiek;
    private boolean zablokowany;
    private ArrayList<Zbior> wypozyczenia = new ArrayList<>();

    public uzytkownik(String imie, String nazwisko, String adres, String dataZapisu, int wiek, boolean zablokowany, ArrayList<Zbior> wypozyczenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.dataZapisu = dataZapisu;
        this.wiek = wiek;
        this.zablokowany = zablokowany;
        this.wypozyczenia = wypozyczenia;
    }

    private String  PrzedstawSie(){
        return getImie()+" "+getNazwisko();
    }

    public void wypozycz(Zbior zbior){
        if(isZablokowany()==true){
            System.out.println("Użytkownik "+PrzedstawSie()+" jest zablokowany i nie może wypożyczyć "+ zbior.getNazwa());
        }
        else{
            System.out.println("Użytkownik " + PrzedstawSie() + " wypożyczył " + zbior.getNazwa());
            wypozyczenia.add(zbior);
            System.out.println(zbior.getNazwa() + " musi zostac oddane do 15-07-2020, w przeciwnym wypadku naliczona zostanie kara pieniężna w wysokosic 10 zł + 1 zł za każdy dzień ponad termin");
        }
    }

    public void historiaWypozyczen(){
        System.out.println("Historia wypożyczeń dla użytkownika "+PrzedstawSie());
        for (int i = 0; i < wypozyczenia.size() ; i++) {
            System.out.println((i+1)+". "+wypozyczenia.get(i).getNazwa());
        }
    }


    public boolean isZablokowany() {
        return zablokowany;
    }

    public void setZablokowany(boolean zablokowany) {
        this.zablokowany = zablokowany;
        System.out.println(PrzedstawSie() + " został zablokowany");

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDataZapisu() {
        return dataZapisu;
    }

    public void setDataZapisu(String dataZapisu) {
        this.dataZapisu = dataZapisu;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }



}
