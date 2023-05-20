package kyu_8.Third_Angle_of_a_Triangle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ThirdAngleTest {
    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngle.otherAngle(45,12));
        assertEquals(70, ThirdAngle.otherAngle(50,60));
    }
}