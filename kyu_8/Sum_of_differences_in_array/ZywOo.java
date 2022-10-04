package kyu_8.Sum_of_differences_in_array;

import java.util.Arrays;

public class ZywOo {
    public static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }
}