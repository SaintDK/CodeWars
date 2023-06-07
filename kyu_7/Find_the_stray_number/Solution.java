package kyu_7.Find_the_stray_number;

import java.util.Arrays;

class Solution {
  static int stray(int[] numbers) {
    return Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
  }
}
