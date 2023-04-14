package kyu_7.Power_of_two;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(long n) {

        return n > 0 && (n-- & n) < 1;

    }
}
