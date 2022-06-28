package kyu_8.A_Needle_in_the_Haystack;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        int sum = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == "needle") {
                return "found the needle at position "+ i;
            }
        }
        return null;
    }
}