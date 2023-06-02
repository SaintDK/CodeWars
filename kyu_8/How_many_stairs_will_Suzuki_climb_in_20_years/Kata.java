package kyu_8.How_many_stairs_will_Suzuki_climb_in_20_years;

import java.util.*;
import java.util.stream.*;

public class Kata
{
    public static long stairsIn20(int[][] stairs)
    {
        return Arrays.stream(stairs).flatMapToInt(IntStream::of).sum() * 20;
    }
}