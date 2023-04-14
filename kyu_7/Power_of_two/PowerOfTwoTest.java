package kyu_7.Power_of_two;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PowerOfTwoTest {

    @Test
    public void testPowerOfTwo() {
        assertEquals(true, PowerOfTwo.isPowerOfTwo(   2));
        assertEquals(true, PowerOfTwo.isPowerOfTwo(4096));
    }

    @Test
    public void testNotPowersOfTwo() {
        assertEquals(false, PowerOfTwo.isPowerOfTwo(333));
        assertEquals(false, PowerOfTwo.isPowerOfTwo(  0));
    }
}