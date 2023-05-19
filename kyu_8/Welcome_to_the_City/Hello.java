package kyu_8.Welcome_to_the_City;

import java.util.Arrays;

public class Hello{
    public String sayHello(String [] name, String city, String state){
        String fullName = "";
        for (String nam : name){
            fullName += " " + nam;
        }
        return String.format("Hello,%s! Welcome to %s, %s!", fullName, city, state);
    }
}
//Hello, John Smith! Welcome to Phoenix, Arizona!