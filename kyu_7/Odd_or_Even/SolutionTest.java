package kyu_7.Odd_or_Even;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}