package kyu_7.Exes_and_Ohs;

public class XO {

    public static boolean getXO (String str) {

        str = str.toLowerCase();
        char[] strChar = str.toCharArray();

        int X = 0 , O = 0;

        for (int i=0; i<str.length(); i++) {
            if (strChar[i] == 'x') {X += 1;}
            if (strChar[i] == 'o') {O += 1;}
        }
        if (X == O) {return true;}
        return false;
    }
}