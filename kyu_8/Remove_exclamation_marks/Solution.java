package kyu_8.Remove_exclamation_marks;

class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}