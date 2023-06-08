package kyu_8.Beginner_Series_1_School_Paperwork;

public class Paper
{
    public static int paperWork(int n, int m)
    {
        return (n<0 | m<0) ? 0: (m*n);
    }
}