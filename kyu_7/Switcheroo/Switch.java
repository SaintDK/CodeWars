package kyu_7.Switcheroo;

public class Switch {
    public static String switcheroo(String x) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {

            char y = x.charAt(i);
            if (y == 'a') {sb.append('b');}
            if (y == 'b') {sb.append('a');}
            if (y == 'c') {sb.append('c');}

        }
        return sb.toString();
    }
}