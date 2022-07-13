package kyu_8.Find_Maximum_and_Minimum_Values_of_a_List;

public class Kata {
    public int max(int[] list) {
        int max = list[0];
        for (int i : list) {
            if (i > max) {max = i;}
        }
        return max;
    }
    public int min(int[] list) {
        int min = list[0];
        for (int i : list) {
            if (i < min) {min = i;}
        }
        return min;
    }

}

