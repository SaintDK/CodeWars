package kyu_7.Sum_of_the_first_nth_term_of_Series;

public class NthSeries {

    public static String seriesSum(int n) {

        double sum = 0.0;
        for (int i = 0; i < n; i++)
            sum += 1.0 / (1 + 3 * i);

        return String.format("%.2f", sum);

    }
}