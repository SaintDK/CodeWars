package kuy_6.Find_the_odd_int;

public class FindOdd {
    public static int findIt(int[] A) {
        int x = 0;
        for (int i = 0; i < A.length; i++) {
            x ^= A[i];
        }
        return x;
    }
}