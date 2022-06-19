package kyu_7.Vowel_Count;

public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] chars = (str).toCharArray();
        int count = chars.length;
        char symbol;
        for (int i = 0; i < count; i++) {
            symbol= str.charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u'){
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}