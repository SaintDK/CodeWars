package kyu_8.Is_it_a_number;

import static java.lang.System.in;

public class MyUtilities {

    boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}