package Wypozyczalnia;

import Zbiory.Zbior;

import java.util.ArrayList;

public class wypozyczalnia {

    private String nazwa;
    private półki półki;

    public wypozyczalnia(String nazwa, półki półki) {
        this.nazwa = nazwa;
        this.półki = półki;
        System.out.println("Witamy w wypożyczalni "+ getNazwa());
    }

    public void dodajZbior(Zbior zbior){
        System.out.println("Dodano zbiór:"+zbior.getNazwa());
        półki.getZbiory().add(zbior);
    }

    public void wyswietlZbiory(){
        for (int i = 0; i < półki.getZbiory().size() ; i++) {
            System.out.println((i+1)+". "+półki.getZbiory().get(i).getNazwa());
        }
    }

    public String getNazwa() {
        return nazwa;
    }

}
