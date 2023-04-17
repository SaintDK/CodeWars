package kyu_7.Changing_letters;

public class Kata {
    public static String swap(String st){

        return st.replace("a","A")
                .replace("e", "E")
                .replace("i", "I")
                .replace("o", "O")
                .replace("u", "U");
//                .replace("y", "Y");
    }
}