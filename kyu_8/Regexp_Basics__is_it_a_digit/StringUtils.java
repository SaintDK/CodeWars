package kyu_8.Regexp_Basics__is_it_a_digit;

public class StringUtils {

    public static boolean isDigit(String s) {

        if (s.length() > 1) {return false;}

        if (s.matches("[0-9]")) {return true;}

        return false;
    }
}