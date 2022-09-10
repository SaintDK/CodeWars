package kyu_8.How_old_will_I_be_in_2099;

public class AgeDiff {
    public static String CalculateAge(int birth, int yearTo) {

        if (birth < yearTo && yearTo - birth == 1) {String s = String.valueOf(yearTo - birth);
            return "You are " + s + " year old.";}

        if (birth > yearTo && birth - yearTo == 1) {String s = String.valueOf(birth - yearTo);
            return "You will be born in " + s + " year.";}

        if (birth < yearTo) {String s = String.valueOf((yearTo - birth));
            return "You are " + s + " years old.";}

        if (birth > yearTo) {String s = String.valueOf(birth - yearTo);
            return "You will be born in " + s + " years.";}


        return "You were born this very year!";
    }
}