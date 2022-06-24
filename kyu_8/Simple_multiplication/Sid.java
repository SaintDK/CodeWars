package kyu_8.Simple_multiplication;

public class Sid {
    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            int x = n * 8;
            return x;
        }
        if (n % 1 == 0) {
            int x = n * 9;
            return x;
        }
        return n;
    }
}