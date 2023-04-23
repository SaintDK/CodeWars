package kyu_8.Return_the_day;

import java.util.HashMap;
import java.util.Map;

public class DayOfWeek {

    public static String getDay(int n) {

        if (n > 7) {return "Wrong, please enter a number between 1 and 7";}

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

}