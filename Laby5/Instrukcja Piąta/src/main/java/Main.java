import org.testng.annotations.Test; // pakiet do pisania testów

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*; //asercje

public class Main
{

    static int add(int a, int b)
    {
        return a+b;
    }

    static boolean temperatury(int t1, int t2)
    {
        if(t1 <100 || t2 <100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean sekwencje()
    {
        int[] tablica = new int[10];
        tablica[0] = 4;
        tablica[1] = 4;
        tablica[2] = 4;
        tablica[3] = 1;
        tablica[4] = 2;
        tablica[5] = 3;
        tablica[6] = 4;
        tablica[7] = 4;
        tablica[8] = 4;
        tablica[9] = 4;
        int a=0;
        try
        {
            for (int i = 0; i < 10; i++)
            {
                if(tablica[i]==1 && tablica[i+1]==2 && tablica[i+2]==3)
                {
                    a=1;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Brak sekwencji 123");
        }

        if(a==0)
        {
            return false;
        }
        if(a==1)
        {
            return true;
        }
        return false;
    }

    static String polowa(String a)
    {
        int b = a.length();
        b = b/2;
        a = a.substring(0,b);
        return a;
    }

    static List odwrotnosc()
    {
        List<Integer> liczby = Arrays.asList(1, 2, 3);
        Collections.reverse(liczby);
        return liczby;
    }


    public static void main(String[] args)
    {

        odwrotnosc();

    }


}
