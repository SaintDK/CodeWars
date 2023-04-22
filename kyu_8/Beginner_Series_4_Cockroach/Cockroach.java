package kyu_8.Beginner_Series_4_Cockroach;

public class Cockroach{
    public int cockroachSpeed(double kph){
        int secondsInHour = 3600;
        int cmInKm = 100000;
        int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
        return centimetresPerSecond;
    }
}