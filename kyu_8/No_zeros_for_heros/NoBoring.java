package kyu_8.No_zeros_for_heros;

public class NoBoring {
    public static int noBoringZeros(int n) {
        // your code
        return n == 0 || n % 10 != 0 ? n : noBoringZeros(n/10);
    }
}