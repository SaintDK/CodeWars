package kyu_8.Count_by_X;


public class Kata{
    public static int[] countBy(int x, int n){
        int[] count = new int[n];
        int a = x;
        for (int i=0; i<n; i++) {
            count[i] = a;
            a = a+x;
            System.out.print(count[i]);
        }
        return count;
    }
}