package kyu_8.Return_the_day;

import java.util.HashMap;
import java.util.Map;

public class DayOfWeek {

    public static String getDay(int n) {

        if (n > 7 || n <= 0) {return "Wrong, please enter a number between 1 and 7";}

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Sunday");
        map.put(2, "Monday");
        map.put(3, "Tuesday");
        map.put(4, "Wednesday");
        map.put(5, "Thursday");
        map.put(6, "Friday");
        map.put(7, "Saturday");

        String key = map.get(n);

        return key;
    }

//    public static String getDay(int n) {
//        return switch(n){
//            case 1 -> "Sunday";
//            case 2 -> "Monday";
//            case 3 -> "Tuesday";
//            case 4 -> "Wednesday";
//            case 5 -> "Thursday";
//            case 6 -> "Friday";
//            case 7 -> "Saturday";
//            default -> "Wrong, please enter a number between 1 and 7";
//        };
//    }

}