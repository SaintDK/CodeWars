package kyu_8.Sum_Arrays;

public class SumArray {
    public static double sum(double[] numbers) {
        double count = 0;
        for (int i=0;i < numbers.length;i++) {
            count += numbers[i];
        }
        return count;
    }
}