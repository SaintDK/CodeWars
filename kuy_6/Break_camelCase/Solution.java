package kuy_6.Break_camelCase;

import java.util.Arrays;

class Solution {
    public static String camelCase(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }
}
//class Solution {
//  public static String camelCase(String input) {
//  String output = "";
//        for (int i = 0; i < input.length(); i++) {
//            output = Character.isUpperCase(input.charAt(i)) ? output + " " + input.charAt(i) : output + input.charAt(i);
//       }
//        return output;
//  }
//}
