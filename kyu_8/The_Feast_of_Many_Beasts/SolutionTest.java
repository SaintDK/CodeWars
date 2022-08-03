package kyu_8.The_Feast_of_Many_Beasts;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

// TODO: Replace examples and use TDD development by writing your own tests

public class SolutionTest {
    @Test
    public void fixedTest() {
        assertTrue(Kata.feast("great blue heron","garlic nann"));
        assertTrue(Kata.feast("chickadee","chocolate cake"));
        assertFalse(Kata.feast("brown bear","bear claw"));
    }
}