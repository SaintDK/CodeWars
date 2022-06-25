package kyu_7.Odd_or_Even;

public class Codewars {
    public static String oddOrEven (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return "odd";
            }
        }
        return "0";
    }
}