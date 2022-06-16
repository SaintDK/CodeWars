package kyu_8.Return_Negative;

public class Kata {

    public static int makeNegative(final int x) {
        if (x == 0){return (0);}
        if (x < 0){return (x);}
        int i = 0; i -= x;
        return (i); // Your code here.

    }

}