package kyu_7.Odd_or_Even;

import static java.util.Arrays.stream;

class Codewars {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
}