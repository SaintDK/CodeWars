package kuy_8.Sentence_Smash;

import java.util.Arrays;

public class SmashWords {

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        String answer = "";
        for (int i = 0; i < words.length; i++) {
            answer += String.valueOf(words[i]);

            if (i < words.length - 1) {answer += " ";}
        }
        return answer;
    }

}