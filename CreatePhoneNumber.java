public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        String result = "(";

        for(int numbers_x = 0; numbers_x < numbers.length; numbers_x++){
            result += numbers[numbers_x];

            if(numbers_x == 2){
                result += ") ";
            } else if (numbers_x == 5){
                result += "-";
            }
        }

        return result;

    }
}