package kyu_7.Count_the_divisors_of_a_number;

public class FindDivisor {
    public long numberOfDivisors(int n) {

        int count = 0;
        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {count++;}

        }
        return count;
    }
}