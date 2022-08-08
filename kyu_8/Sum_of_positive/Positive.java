package kyu_8.Sum_of_positive;

public class Positive{

    public static int sum(int[] arr){
        int count =0;
        for (int i=0; i < arr.length ;i++) {
            if (arr[i] > 0) {count += arr[i];}
        }
        return count;
    }

}