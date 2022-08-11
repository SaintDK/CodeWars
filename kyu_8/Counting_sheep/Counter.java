package kyu_8.Counting_sheep;
public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i = 0; i < arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == true){
                count ++;
            }
        }
        return count;
    }
}