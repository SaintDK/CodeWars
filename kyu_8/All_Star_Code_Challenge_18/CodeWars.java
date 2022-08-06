package kyu_8.All_Star_Code_Challenge_18;

public class CodeWars {
    public static int strCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i<str.length(); i++) {
            char[] strChar = str.toCharArray();
            if (strChar[i] == letter) {count += 1;}
        }
        return count;
    }
}