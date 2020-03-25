package Wypozyczalnia;

import Zbiory.Zbior;

import java.util.ArrayList;

public class wypozyczalnia {

    private String nazwa;
    private ArrayList<Zbior> zbiory = new ArrayList<>();

    public wypozyczalnia(String nazwa, ArrayList zbiory) {
        this.nazwa = nazwa;
        this.zbiory = zbiory;
        System.out.println("Witamy w wypożyczalni "+ getNazwa());
    }

    public void dodajZbior(Zbior zbior){
        System.out.println("Dodano zbiór:"+zbior.getNazwa());
        zbiory.add(zbior);
    }

    public void wyswietlZbiory(){
        for (int i = 0; i < zbiory.size() ; i++) {
            System.out.println((i+1)+". "+zbiory.get(i).getNazwa());
        }
    }

    public String getNazwa() {
        return nazwa;
    }

}
