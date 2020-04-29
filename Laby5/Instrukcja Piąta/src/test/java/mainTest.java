import org.junit.jupiter.api.Test; // pakiet do pisania testów

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*; //asercje

public class mainTest
{
    @Test
    static void test()
    {
        assertEquals(5, Main.add(2,3));
    }
    @Test
    static void test2()
    {
        assertEquals(-3, Main.add(-1,-3));
    }

    @Test
    static void testTemperatur()
    {
        assertEquals(true,Main.temperatury(30,120));
    }

    static void testSekwencji()
    {
        assertEquals(true,Main.sekwencje());
    }

    static void testPolowy()
    {
        assertEquals("pol",Main.polowa("polowa"));
    }

    static void testOdwracania()
    {
        assertEquals(Arrays.asList(3, 2, 1),Main.odwrotnosc());
    }


    public static void main(String[] args)
    {
        testTemperatur();
        testSekwencji();
        testPolowy();
        testOdwracania();
    }


}
