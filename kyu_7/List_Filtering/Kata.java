package kyu_7.List_Filtering;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.in;

public class Kata {
    public static List<Integer> filterList(List<Object> list) {
        return list.stream()
                .filter(item -> item instanceof Integer)
                .map(item -> (Integer) item)
                .collect(Collectors.toList());
    }
}
