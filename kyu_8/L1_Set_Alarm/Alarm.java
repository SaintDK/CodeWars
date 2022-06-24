package kyu_8.L1_Set_Alarm;

public class Alarm {

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if (employed == true && vacation == false) {
            return true;
        }
        if (employed == true && vacation == true
                || employed == false && vacation == false
                || employed == false && vacation == true) {
            return false;
        }
        return false;
    }
}