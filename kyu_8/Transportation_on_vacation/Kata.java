package kyu_8.Transportation_on_vacation;

public class Kata {
    public static int rentalCarCost(int d) {
        int rent = d * 40;
        if (d>=3) {rent = rent - 20;}
        if (d>=7) {rent = rent - 30;}
        return rent;
    }
}
