import java.util.Scanner;

public class main {

    public static void parsowanie()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbe do sparsowania na INT: ");
        try
        {
            String znaki = scan.nextLine();
            int liczba = Integer.parseInt(znaki);
            System.out.println("Twoja liczba: "+liczba);
        }
        catch (Exception wyjatek)
        {
            System.out.println("Podane znaki nie są liczbą :)");
        }

    }

    public static void listowanie()
    {
        System.out.println("Podaj pozycję aby wyświetlić jej liczbę z tablicy: ");
        int[] tab = {14,5,3,8,2,8,3,5,9,1,4,7,3,6,8,53,6,3,35};
        Scanner scan = new Scanner(System.in);
        int liczba;


        try
        {
             liczba = scan.nextInt();
             System.out.println("Twoja liczba to: "+tab[liczba-1]);
        }
        catch (Exception wyjatek)
        {
            liczba = 7;
            System.out.println("Podano pozycję spoza zakresu lub nie podano liczby. Wyświetlam liczbę siódmą: ");
            System.out.println("Twoja liczba to: "+tab[liczba-1]);
        }




    }



    public static void main(String[] args)
    {
        parsowanie();
        listowanie();
    }

}
