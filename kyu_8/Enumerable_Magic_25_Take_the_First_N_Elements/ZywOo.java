package kyu_8.Enumerable_Magic_25_Take_the_First_N_Elements;

import java.util.Arrays;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        return Arrays.copyOf(arr, Math.min(n, arr.length));
    }
}