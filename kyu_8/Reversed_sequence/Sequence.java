package kyu_8.Reversed_sequence;

public class Sequence{

    public static int[] reverse(int n){
        if (n<=0) return null;

        int[] out = new int[n];

        for (int x=n, i=0; x>0; x--) {
            out[i] = x;
            i++;
        }
        return out;
    }

}
