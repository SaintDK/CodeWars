package kyu_8.Correct_the_mistakes_of_the_character_recognition_software;

public class Correct {
    public static String correct(String string) {
        String answer = "";
        char[] stringChar = string.toCharArray();
        for (int i=0;i<string.length();i++) {
            if (stringChar[i] == '1') {answer += "I";}
            if (stringChar[i] == '5') {answer += "S";}
            if (stringChar[i] == '0') {answer += "O";}
            if (stringChar[i] != '1' && stringChar[i] != '5' && stringChar[i] != '0') {answer += stringChar[i];}
        }
        return answer;
    }
}