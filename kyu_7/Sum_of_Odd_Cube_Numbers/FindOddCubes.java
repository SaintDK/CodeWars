package kyu_7.Sum_of_Odd_Cube_Numbers;


import static java.util.stream.IntStream.of;

class FindOddCubes {
    static int cubeOdd(int[] arr) {
        return of(arr).map(n -> n % 2 != 0 ? n * n * n : 0).sum();
    }
}