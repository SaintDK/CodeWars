package kyu_8.The_Wide_Mouthed_frog;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WideMouthedFrogTest {

    @Test
    public void fixedTests() {
        assertEquals("wide", WideMouthedFrog.mouthSize("toucan"));
        assertEquals("wide",WideMouthedFrog.mouthSize("ant bear"));
        assertEquals("small", WideMouthedFrog.mouthSize("alligator"));
    }
}