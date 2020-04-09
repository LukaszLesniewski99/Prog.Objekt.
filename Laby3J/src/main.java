import java.util.Random;
import java.util.Scanner;

public class main {

    public static int tablica[] = new int[200];

    public static void przygotujTablice()
    {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++)
        {
            tablica[i] = r.nextInt(10);
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int wybor;
        System.out.println("Wybierz metodę sortowania:");
        System.out.println("1.Sortowanie bąbelkowe");
        System.out.println("2.Sortowanie kubełkowe");
        wybor = scan.nextInt();
        przygotujTablice();
        if(wybor==1) {
            babelki bsort = new babelki();
            bsort.sortBab(tablica);
        }
        if(wybor==2) {
            trash bucket = new trash();
            bucket.sortuj(tablica);
        }
    }
}
