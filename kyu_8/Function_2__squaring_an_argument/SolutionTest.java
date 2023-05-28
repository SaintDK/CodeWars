package kyu_8.Function_2__squaring_an_argument;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class SolutionTest {
    @Test
    void fixed_tests() {
        assertEquals(4, Kata.square(2));
        assertEquals(2500, Kata.square(50));
        assertEquals(1, Kata.square(1));
    }
}
