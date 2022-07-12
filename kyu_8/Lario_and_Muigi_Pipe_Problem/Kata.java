package kyu_8.Lario_and_Muigi_Pipe_Problem;

import java.util.stream.IntStream;


public class Kata {
    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}