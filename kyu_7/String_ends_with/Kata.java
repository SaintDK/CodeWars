package kyu_7.String_ends_with;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.length()>str.length()) {return false;}
        str = str.toLowerCase();
        int first = str.length();
        ending = ending.toLowerCase();
        int second = ending.length();
        if (first < second)
        {
            String temp = ending.substring(second - first, second);
            if (temp.compareTo(str) == 0) return true;
            else return false;
        } else
        {
            String temp = str.substring(first - second, first);
            if (temp.compareTo(ending) == 0) return true;
            else return false;
        }
    }
}