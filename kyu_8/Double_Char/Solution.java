package kyu_8.Double_Char;

public class Solution{
    public static String doubleChar(String s){
        return s.replaceAll(".", "$0$0");
    }
}