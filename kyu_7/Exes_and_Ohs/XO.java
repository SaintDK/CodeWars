package kyu_7.Exes_and_Ohs;

public class XO {

    public static boolean getXO (String str) {
        char[] strChar = str.toCharArray();

        int X = 0 , O = 0;

        for (int i=0; i<str.length(); i++) {
            if (strChar[i] == 'x' || strChar[i] == 'X') {X += 1;}
            if (strChar[i] == 'o' || strChar[i] == 'O') {O += 1;}
        }
        if (X == O) {return true;}
        return false;
    }
}