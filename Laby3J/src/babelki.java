public class babelki {

    public static void sortBab(int[] tablica)
    {
        int mLiczba = tablica.length-1;
        int wLiczba = mLiczba-1;
        int liczba_porownan = 0;

        int t;
        while (wLiczba >= 0)
        {
            liczba_porownan++;
            if (tablica[wLiczba] > tablica[mLiczba])
            {
                t = tablica[wLiczba];
                tablica[wLiczba] = tablica[mLiczba];
                tablica[mLiczba] = t;

                mLiczba = tablica.length-1;
                wLiczba = mLiczba-1;
            }
            else
            {
                mLiczba--;
                wLiczba--;
            }
        }
        System.out.println("Liczba porównań sortowania bąbelkowego: "+liczba_porownan);
        for (int i = 0; i < tablica.length ; i++) {
            System.out.print(tablica[i]+" ");
        }
    }
    public void Sortuj(){
    }
}
