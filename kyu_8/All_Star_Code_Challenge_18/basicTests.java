package kyu_8.All_Star_Code_Challenge_18;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class basicTests {
    @Test
    public void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }
}