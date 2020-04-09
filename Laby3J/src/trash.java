import java.util.Arrays;

public class trash {

    static int liczba_porownan = 0;

    static int[] sort(int[] l, int maxWartosc)
    {
        int[] Kubelek = new int[maxWartosc + 1];
        int[] posort = new int[l.length];
        for (int i = 0; i < l.length; i++)
            Kubelek[l[i]]++;
        int outPos = 0;
        for (int i = 0; i < Kubelek.length; i++)
            for (int j = 0; j < Kubelek[i]; j++)
                posort[outPos++] = i;
        return posort;
    }

    static int maxW(int[] nums)
    {
        int maxW = 0;
        for (int i = 0; i < nums.length; i++) {
            liczba_porownan++;
            if (nums[i] > maxW)
                maxW = nums[i];
        }
        return maxW;
    }

    public void sortuj(int tablica[])
    {
        int maxW = maxW(tablica);
        tablica = sort(tablica, maxW);
        System.out.println(Arrays.toString(tablica));
        System.out.println("Liczba porownań sortowania bąbelkowego: "+liczba_porownan);
        tablica = sort(tablica, maxW);
    }
}

