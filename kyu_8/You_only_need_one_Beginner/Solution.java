package kyu_8.You_only_need_one_Beginner;

public class Solution {

    public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {return true;}
        }
        return false;
    }

}