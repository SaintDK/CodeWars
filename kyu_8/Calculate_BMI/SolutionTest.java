package kyu_8.Calculate_BMI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}