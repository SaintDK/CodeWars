package kyu_8.Enumerable_Magic_1_True_for_All;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Solution {
    public static boolean all(int[] list, IntPredicate predicate) {
        return Arrays.stream(list).allMatch(predicate);
    }
}