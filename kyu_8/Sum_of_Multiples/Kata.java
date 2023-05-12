package kyu_8.Sum_of_Multiples;

public class Kata {
    public static long sumMul(int n, int m) {
        if (n < 1 || m < 1) throw new IllegalArgumentException("n or m < 1");
        long multi = (m - 1) / n;
        return (long) multi * (multi + 1) / 2 * n;
    }
}