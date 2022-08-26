package kyu_7.Simple_Fun_176_Reverse_Letter;

public class Kata {
    public static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}