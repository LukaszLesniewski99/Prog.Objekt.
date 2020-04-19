import Wypozyczalnia.półki;
import Zbiory.*;
import Wypozyczalnia.wypozyczalnia;
import użytkownik.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     wypozyczalnia wypozyczalnia = new wypozyczalnia("Cuprum",new półki(new ArrayList<>()));


     Filmy film1 = new Filmy("Nowa nadzieja","asdf","as","as",2,3,4,"123","123");
     Ebook ebook1 = new Ebook("Zemsta Sithow","asdf","as","as",2,3,4,123);
     Ksiazka ksiazka1 = new Ksiazka("Mroczne Widmo","asdf","as","as",2,3,4);
     PłytaMuzyczna plyta1 = new PłytaMuzyczna("Atak Klonow","asdf","as","as",2,3,4,"123");
     Audiobook audiobook1 = new Audiobook("Imperium Kontratakuje","asdf","as","as",2,3,4,123,"123");

     wypozyczalnia.dodajZbior(film1);
     wypozyczalnia.dodajZbior(ebook1);
     wypozyczalnia.dodajZbior(ksiazka1);
     wypozyczalnia.dodajZbior(plyta1);
     wypozyczalnia.dodajZbior(audiobook1);

     uzytkownik mKowalski = new uzytkownik("Michał","Kowalski","Zielona 11","12-03-2020",24,false,new listaWypożyczeń(new ArrayList<>()));
     uzytkownik mNowak = new uzytkownik("Marek","Nowak","Niebieska 11","03-02-2020",26,false,new listaWypożyczeń(new ArrayList<>()));

     mKowalski.wypozycz(ksiazka1);
     mKowalski.wypozycz(film1);
     mKowalski.historiaWypozyczen();

     mNowak.wypozycz(plyta1);
     mNowak.setZablokowany(true);
     mNowak.wypozycz(audiobook1);
     mNowak.historiaWypozyczen();

    }
}
