package kyu_7.Sum_of_Triangular_Numbers;

public class Kata
{
    public static int sumTriangularNumbers(int n)
    {
        if (n <= 0) return 0;
        return n*(n+1)*(n+2)/6;
    }
}