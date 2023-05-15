package kyu_7.Currying_functions_multiply_all_elements_in_an_array;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Kata {
    public static Function<Integer, int[]> multiplyAll(int[] array) {
        return integer -> IntStream.of(array).map(x -> integer * x).toArray();
    }
}