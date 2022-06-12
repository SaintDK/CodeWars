public class Kata{
    public static double find_average(int[] array){
        double s = 0;

        for (int i : array) {
            s += i;
        }
        return s / array.length;

    }
}