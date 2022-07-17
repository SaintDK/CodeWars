package kyu_8.What_is_between;

import static java.util.stream.IntStream.rangeClosed;

public class Kata {

    public static int[] between(int a, int b) {
        return rangeClosed(a, b).toArray();
    }
}