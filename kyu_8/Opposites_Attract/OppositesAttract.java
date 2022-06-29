package kyu_8.Opposites_Attract;

public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        String fl1="",fl2="";
        if (flower1%2==0) {fl1 = "even";}
        if (flower2%2==0) {fl2 = "even";}
        if (flower1%2!=0) {fl1 = "odd";}
        if (flower2%2!=0) {fl2 = "odd";}
        if (fl1 == fl2) {return false;}
        return true;
    }

}