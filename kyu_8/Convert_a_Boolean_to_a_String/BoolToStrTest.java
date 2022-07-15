package kyu_8.Convert_a_Boolean_to_a_String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BoolToStrTest{
    @Test public void testTrue(){
        assertEquals(BooleanToString.convert(true), "true");
    }

    @Test public void testFalse(){
        assertEquals(BooleanToString.convert(false), "false");
    }
}