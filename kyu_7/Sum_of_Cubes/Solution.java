package kyu_7.Sum_of_Cubes;

public class Solution{
    public static long sumCubes(long x) {
        return java.util.stream.LongStream.rangeClosed(1, x).map(i -> i*i*i).sum();
    }
}