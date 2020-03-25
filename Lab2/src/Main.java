import Zbiory.*;
import Wypozyczalnia.wypozyczalnia;
import użytkownik.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

     wypozyczalnia wypozyczalnia = new wypozyczalnia("Cuprum",new ArrayList());


     Filmy film1 = new Filmy("Nowa nadzieja","George Lucas","19.07.1979","Lucasfilm",1,17,121,"Fantasy","George Lucas");
     Ebook ebook1 = new Ebook("Zemsta Sithow","George Lucas","17.05.2005","Lucasfilm",2,14,4,100);
     Ksiazka ksiazka1 = new Ksiazka("Mroczne Widmo","George Lucas","19.05.1999","Lucasfilm",3,11,220);
     PłytaMuzyczna plyta1 = new PłytaMuzyczna("Atak Klonow","George Lucas","16.05.2002","Lucasfilm",4,7,15,"Fantasy");
     Audiobook audiobook1 = new Audiobook("Imperium Kontratakuje","George Lucas","17.05.1980","Lucasfilm",5,16,4,420,"Tomasz Knapik");

     wypozyczalnia.dodajZbior(film1);
     wypozyczalnia.dodajZbior(ebook1);
     wypozyczalnia.dodajZbior(ksiazka1);
     wypozyczalnia.dodajZbior(plyta1);
     wypozyczalnia.dodajZbior(audiobook1);

     uzytkownik mKowalski = new uzytkownik("Michał","Kowalski","Zielona 11","12-03-2020",24,false,new ArrayList<>());
     uzytkownik mNowak = new uzytkownik("Marek","Nowak","Niebieska 11","03-02-2020",26,false,new ArrayList<>());

     mKowalski.wypozycz(ksiazka1);
     mKowalski.wypozycz(film1);
     mKowalski.historiaWypozyczen();

     mNowak.wypozycz(plyta1);
     mNowak.setZablokowany(true);
     mNowak.wypozycz(audiobook1);
     mNowak.historiaWypozyczen();

    }
}
