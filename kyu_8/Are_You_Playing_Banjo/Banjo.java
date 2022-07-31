package kyu_8.Are_You_Playing_Banjo;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        if (name.startsWith("r") || name.startsWith("R")) {return name + " plays banjo";}
        return name + " does not play banjo";
    }
}