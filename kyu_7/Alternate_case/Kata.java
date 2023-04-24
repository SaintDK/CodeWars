package kyu_7.Alternate_case;

import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversions;

import java.util.stream.Collectors;

class Kata {
    static String alternateCase(final String string) {
        return string.chars()
                .mapToObj(i -> new Character((char) i))
                .map(i -> Character.isUpperCase(i) ? Character.toLowerCase(i) : Character.toUpperCase(i))
                .map(i -> i.toString())
                .collect(Collectors.joining(""));
    }
}