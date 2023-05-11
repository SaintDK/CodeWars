package kyu_7.Disemvowel_Trolls;

public class Troll {
    public static String disemvowel(String str) {

        return str.replaceAll("[aAuUiIoOeE]", "");
    }
}