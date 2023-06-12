package kyu_8.Bin_to_Decimal.Converter;

public class Converter{
    public static int binToDecimal(String inp){
        return Integer.parseInt(inp, 2);
    }

}

//public class Converter{
//    public static int binToDecimal(String inp){
//        int res = 0;
//        int j = 1;
//        for(int i = inp.length() - 1; i >=0; i--){
//            res += j*((int)inp.charAt(i) - 48);
//            j *= 2;
//        }
//        return res;
//    }
//}