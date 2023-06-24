package kyu_8.Kata_Example_Twist;


import java.util.Arrays;

public class KataExampleTwist
{
    public static String[] kataExampleTwist()
    {
        String[] websites = new String[1000];
        Arrays.fill(websites,"codewars");
        return websites;
    }
}

//class KataExampleTwist {
//    static String[] kataExampleTwist() {
//        return "codewars,".repeat(1000).split(",");
//    }
//}