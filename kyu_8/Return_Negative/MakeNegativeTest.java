package kyu_8.Return_Negative;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MakeNegativeTest {

    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
    @Test
    public void test2() {
        assertEquals(-5, Kata.makeNegative(-5));
    }
    @Test
    public void test3() {
        assertEquals(0, Kata.makeNegative(0));
    }


}