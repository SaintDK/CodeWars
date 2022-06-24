package kyu_8.Abbreviate_a_Two_Word_Name;

import java.util.Locale;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        name = name.toUpperCase();;
        String names[] = name.split(" ");
        return names[0].charAt(0)+"."+names[1].charAt(0);
    }
}