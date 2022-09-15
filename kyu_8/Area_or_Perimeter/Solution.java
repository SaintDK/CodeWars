package kyu_8.Area_or_Perimeter;

public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w){return l*w;}
        return (l + w) * 2;
    }
}