package kuy_6.Highest_Scoring_Word;

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

    public static String high(String s) {
        return Arrays.stream(s.toLowerCase().split(" "))
                .max(Comparator.comparingInt((String w) -> w.chars().map(c -> c - 96).sum()))
                .get();
    }

}