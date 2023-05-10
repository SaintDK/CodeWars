package kyu_7.Bumps_in_the_Road;

public class BumpsTheRoad {
    public static String bumps(String road) {

        road = road.replaceAll("[_]", "");
        if (road.length() > 15) {return "Car Dead";}

        return "Woohoo!";
    }
}