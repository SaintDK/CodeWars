package kyu_8.Simple_validation_of_a_username_with_regex;

public class ZywOo {
    public static boolean validateUsr(String s) {
        return s.matches("[a-z_\\d]{4,16}");
    }
}