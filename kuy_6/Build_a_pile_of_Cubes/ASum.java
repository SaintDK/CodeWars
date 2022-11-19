package kuy_6.Build_a_pile_of_Cubes;

public class ASum {

    public static long findNb(long s) {
        long x = 0, q = 0;
        while (x < s) x += ++q * q * q;
        return x == s ? q : -1;
    }
}