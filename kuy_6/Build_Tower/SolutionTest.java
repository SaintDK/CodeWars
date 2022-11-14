package kuy_6.Build_Tower;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", Kata.TowerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", Kata.TowerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", Kata.TowerBuilder(3)));
    }
}