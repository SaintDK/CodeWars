package kyu_8.Square_n_Sum;

public class Kata {
    public static int squareSum(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n * n;
        }

        return sum;
    }
}