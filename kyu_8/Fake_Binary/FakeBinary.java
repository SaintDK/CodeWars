package kyu_8.Fake_Binary;

public class FakeBinary {
    public static String fakeBin(String numberString) {
        return numberString.replaceAll("[0-4]","0").replaceAll("[4-9]","1");
    }
}


//public class FakeBinary {
//    public static String fakeBin(String str) {
//        return str.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
//    }
//}