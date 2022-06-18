package kyu_8.Grasshopper_Personalized_Message;

import java.util.Objects;

class Kata {
    static String greet(String name, String owner) {
        if (Objects.equals(name, owner)){
            return "Hello boss";
        }
        if (!Objects.equals(name, owner)){
            return "Hello guest";
        }
        return name;
    }
}