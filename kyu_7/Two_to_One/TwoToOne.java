package kyu_7.Two_to_One;

import java.util.stream.*;

public class TwoToOne {

    public static String longest (String x1, String x2) {
        return Stream.of(x1.concat(x2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }
}