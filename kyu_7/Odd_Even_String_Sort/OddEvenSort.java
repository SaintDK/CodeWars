package kyu_7.Odd_Even_String_Sort;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.*;
public class OddEvenSort {
    public static String sortMyString(String s) {
        String[] str = s.split("");
        s = IntStream.range(0, str.length).filter(i -> i%2==0).mapToObj(i->str[i]).collect(Collectors.joining( "" )) + " " + IntStream.range(0, str.length).filter(i -> i%2==1).mapToObj(i->str[i]).collect(Collectors.joining( "" ));
        return s;
    }
}