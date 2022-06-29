package kyu_8.Grasshopper_Summation;

public class GrassHopper {

    public static Object summation(int n) {
        int answer = 0, count = 0;
        for (int i = 0; i<n;i++) {answer += 1+count;count++;}
        return answer;
    }
}