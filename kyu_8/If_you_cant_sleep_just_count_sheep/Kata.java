package kyu_8.If_you_cant_sleep_just_count_sheep;

class Kata {
    public static String countingSheep(int num) {
        int count = 1;
        String s = "";
        if (num != 0) {

            for (int i = 1; i <= num; i++) {
                s += count + " sheep...";
                count++;
            }

            return s;
        }

        return "";
    }
}

//class Kata {
//    public static String countingSheep(int num) {
//        if (num == 0) {
//            return "";
//        }
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 1; i <= num; i++) {
//            stringBuilder.append(i + " sheep...");
//        }
//        return stringBuilder.toString();
//
//    }
//}
