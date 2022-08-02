package kyu_8.Convert_number_to_reversed_array_of_digits;

import java.util.Arrays;

public class Kata {
    public static int[] digitize(long n) {

        StringBuilder stingb = new StringBuilder(Long.toString(n)).reverse();
        return Arrays.stream(stingb.toString().split(""))
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}