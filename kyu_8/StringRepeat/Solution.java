package kyu_8.StringRepeat;

public class Solution {
        public static String repeatStr(final int repeat, final String string) {

            String x = "";

            for (int i = 0; i < repeat; i++) {
                x += string;
            }

            return x;
        }
}
