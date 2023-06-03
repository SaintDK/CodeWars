package kyu_8.You_re_a_square;

import static java.lang.Math.*;
public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }
}