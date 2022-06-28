package kyu_8.How_good_are_you_really;

public class Kata {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i < classPoints.length; i++) {
            sum += classPoints[i];
        }
        sum = sum / classPoints.length;
        if (yourPoints <= sum) {
            return false;
        } else {
            return true;
        }
    }
}