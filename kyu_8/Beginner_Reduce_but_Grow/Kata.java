package kyu_8.Beginner_Reduce_but_Grow;

public class Kata{

    public static int grow(int[] x) {
        int n = 1;
        for (int i = 0; i < x.length; i++) {
            n = n * x[i];
        }
        return n;

    }

}