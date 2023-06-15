package kyu_7.Binary_Addition;

public class Kata{

    public static String binaryAddition(int a, int b){

        String answer = Integer.toBinaryString(a + b);

        return answer;
    }
}

// public class Kata{
//   public static String binaryAddition(int a, int b){
//     int sum = a+b;
//     String sumBin = "";
//     while(sum != 0){
//       sumBin = sum%2+sumBin;
//       sum=sum/2;
//     }
//     return sumBin;
//   }
// }
