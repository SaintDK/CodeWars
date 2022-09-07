package kyu_8.Exclamation_marks_series_11_Replace_all_vowel_to_exclamation_mark_in_the_sentence;

public class Solution {
    public static String replace(String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}