package Dashatize_it;

public class Solution {

    public static String dashatize(final int number) {
        return String.valueOf(number)
                .replaceAll("([13579])", "-$1-")
                .replaceAll("--", "-")
                .replaceAll("^-|-$", "");
    }
}