package kyu_8.Greet_Me;

public class GreetMe{
    public static String greet(String name){
        return "Hello " + name.toLowerCase().substring(0, 1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}