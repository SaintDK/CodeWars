package kyu_8.Grasshopper_Array_Mean;

import java.util.stream.IntStream;

public class GrassHopper {

    public static int findAverage(int[] nums) {
        return IntStream.of(nums).sum() / nums.length;
    }
}