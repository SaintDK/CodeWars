package kyu_7.Reverse_words;

import java.util.Arrays;
import java.util.stream.Collectors;
public class Kata{
    public static String reverseWords(final String original){
        return original.trim().isEmpty()?original:Arrays.stream(original.split(" ")).map(s->new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
    }
}