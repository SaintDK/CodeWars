package kyu_7.Parts_of_a_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partlist {

    public static String[][] partlist(String[] arr) {
        List<String[]> result = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            String first = String.join(" ", Arrays.copyOfRange(arr, 0, i));
            String second = String.join(" ", Arrays.copyOfRange(arr, i, arr.length));
            result.add(new String[] { first, second });
        }
        return result.toArray(new String[result.size()][]);
    }
}