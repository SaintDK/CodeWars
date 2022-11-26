package kyu_7.The_highest_profit_wins;

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] x) {
        Arrays.sort(x);
        return new int[]{x[0],x[x.length-1]};
    }
}