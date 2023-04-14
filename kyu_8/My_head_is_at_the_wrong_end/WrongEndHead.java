package kyu_8.My_head_is_at_the_wrong_end;

import java.util.Arrays;
import java.util.Collections;

public class WrongEndHead {
    public static String[] fixTheMeerkat(String[] arr) {

        Collections.reverse(Arrays.asList(arr));

        return arr;
    }
}