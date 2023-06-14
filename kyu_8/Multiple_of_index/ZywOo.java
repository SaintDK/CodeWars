package kyu_8.Multiple_of_index;

import java.util.stream.IntStream;

public class ZywOo {
    public static int[] multipleOfIndex(int[] array) {
        return IntStream.range(0, array.length)
                .filter(i -> i == 0 && array[i] == 0 || (i != 0 && array[i] % i == 0))
                .map(i -> array[i])
                .toArray();
    }
}