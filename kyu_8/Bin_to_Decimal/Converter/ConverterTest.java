package kyu_8.Bin_to_Decimal.Converter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConverterTest {

    @Test
    public void testHoopCount() {
        assertEquals(1, Converter.binToDecimal("1"));
        assertEquals(0, Converter.binToDecimal("0"));
        assertEquals(73, Converter.binToDecimal("1001001"));
    }
}