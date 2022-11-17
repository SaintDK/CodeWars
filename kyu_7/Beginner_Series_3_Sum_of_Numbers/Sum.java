package kyu_7.Beginner_Series_3_Sum_of_Numbers;

public class Sum
{
    public int GetSum(int a, int b)
    {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}