package kyu_8.Will_there_be_enough_space;

public class Bob {
    public static int enough(int cap, int on, int wait){
        if (cap < on + wait){return on + wait - cap;}
        return 0;
    }
}