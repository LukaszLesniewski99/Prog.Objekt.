package użytkownik;

import Zbiory.Zbior;

import java.util.ArrayList;

public class listaWypożyczeń {

    private ArrayList<Zbior> wypozyczenia = new ArrayList<>();

    public listaWypożyczeń(ArrayList<Zbior> wypozyczenia) {
        this.wypozyczenia = wypozyczenia;
    }

    public ArrayList<Zbior> getWypozyczenia() {
        return wypozyczenia;
    }
}
