package kyu_8.I_love_you_a_little_a_lot_passionately_not_at_all;

public class Sid {
    public static String howMuchILoveYou(int nb_petals) {

        int i = nb_petals;

        while (nb_petals > 6) {i = nb_petals -= 6;}

        if (i == 1) {return "I love you";}
        if (i == 2) {return "a little";}
        if (i == 3) {return "a lot";}
        if (i == 4) {return "passionately";}
        if (i == 5) {return "madly";}
        if (i == 6) {return "not at all";}

        return "";
    }
}
