package kyu_8.Switch_it_Up;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals("One", Kata.switchItUp(1));
        assertEquals("Three", Kata.switchItUp(3));
        assertEquals("Five", Kata.switchItUp(5));
    }
}