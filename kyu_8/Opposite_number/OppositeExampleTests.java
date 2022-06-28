package kyu_8.Opposite_number;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OppositeExampleTests {
    @Test
    public void tests() {
        assertEquals(-1, Kata.opposite(1));
        assertEquals(25, Kata.opposite(-25));

    }
}