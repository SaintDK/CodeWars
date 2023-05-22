package kyu_7.Descending_Order;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final long num) {

        String str = Integer.toString((int) num);
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String reversed = new StringBuilder(new String(arr)).reverse().toString();
        return Integer.parseInt(reversed);

    }
}