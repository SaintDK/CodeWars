package kyu_8.Fuel_Calculator_Total_Cost;

public class Kata{
    public static double fuelPrice(int litres, double pricePerLitre) {
        // your code here
        double discount = Math.min(0.05*(litres/2),0.25);
        return litres * (pricePerLitre - discount);

    }
}