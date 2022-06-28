package kyu_7.Mumbling;

public class Accumul {
    public static String accum(String s) {

        int count = 1;

        char[] stringChar = s.toCharArray();

        StringBuilder mumbling = new StringBuilder();

        for (char letter : stringChar) {
            for (int i = 0; i < count; i++) {
                if (i == 0) {
                    mumbling.append(Character.toUpperCase(letter));
                }
                else {
                    mumbling.append(Character.toLowerCase(letter));
                }
            }
            mumbling.append('-');
            count++;
        }
        return mumbling.substring(0, mumbling.length()-1);
    }
}