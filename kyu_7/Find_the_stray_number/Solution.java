package kyu_7.Find_the_stray_number;

import java.util.Arrays;

class Solution {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] == numbers[1] ? numbers[numbers.length-1] : numbers[0];
    }
}