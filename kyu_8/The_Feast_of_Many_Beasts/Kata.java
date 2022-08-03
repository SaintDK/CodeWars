package kyu_8.The_Feast_of_Many_Beasts;

public class Kata {

    public static boolean feast(String beast, String dish) {
        return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    }
}