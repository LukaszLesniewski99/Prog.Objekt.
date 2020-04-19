package Wypozyczalnia;

import Zbiory.Zbior;

import java.util.ArrayList;

public class półki {
    private ArrayList<Zbior> zbiory = new ArrayList<>();


    public półki(ArrayList<Zbior> zbiory) {
        this.zbiory = zbiory;
    }

    public ArrayList<Zbior> getZbiory() {
        return zbiory;
    }

}
