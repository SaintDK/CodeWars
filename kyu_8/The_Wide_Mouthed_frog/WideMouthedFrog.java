package kyu_8.The_Wide_Mouthed_frog;

public class WideMouthedFrog {
    public static String mouthSize(String animal) {
        return animal.equalsIgnoreCase("alligator") ? "small" : "wide";
    }
}