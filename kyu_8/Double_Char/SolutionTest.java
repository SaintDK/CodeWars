package kyu_8.Double_Char;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


class SolutionTest {
    @Test
    void sampleTest() {
        assertEquals("SSttrriinngg",Solution.doubleChar("String"));
        assertEquals("HHeelllloo  WWoorrlldd",Solution.doubleChar("Hello World"));
        assertEquals("11223344!!__  ",Solution.doubleChar("1234!_ "));
    }
}