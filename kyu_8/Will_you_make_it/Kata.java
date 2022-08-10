package kyu_8.Will_you_make_it;

public class Kata {

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (mpg * fuelLeft >= distanceToPump) {return true;}
        return false;
    }

}