package kyu_7.Square_Every_Digit;

public class SquareDigit {
    public int squareDigits(int n) {

        char[] chars = ("" + n).toCharArray();
        String str = "";

        for (int i = 0; i < chars.length; i++) {
            int m = Integer.parseInt(String.valueOf(chars[i]));
            str = str + (m * m);
        }

        n = Integer.parseInt(str);
        return n;
    }
}