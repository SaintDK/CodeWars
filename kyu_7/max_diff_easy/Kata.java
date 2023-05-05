package kyu_7.max_diff_easy;

import java.util.Arrays;

public class Kata {


    public static int maxDiff(int[] lst) {

        return GiveMeAnswer(lst);
    }
    public static int GiveMeAnswer(int [] numbers){

        if (numbers.length == 0) {return 0;}

        int max,min;
        max = Arrays.stream(numbers).max().getAsInt();
        min = Arrays.stream(numbers).min().getAsInt();
        System.out.println(max +" "+ min);
        return max - min;
    }
}