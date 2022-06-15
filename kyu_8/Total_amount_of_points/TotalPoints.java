package kyu_8.Total_amount_of_points;

public class TotalPoints {

    public static int points(String[] games) {

        int points = 0;

        for (String entity: games) {
            int x = (int) entity.charAt(0);
            int y = (int) entity.charAt(2);
            if (x>y) points += 3;
            else if (x==y) points ++;
        }
        return points;
    }
}