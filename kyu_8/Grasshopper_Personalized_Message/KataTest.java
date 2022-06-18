package kyu_8.Grasshopper_Personalized_Message;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test public void basicTests() {
        assertEquals("For inputs \"Daniel\" and \"Daniel\"", "Hello boss", Kata.greet("Daniel", "Daniel"));
        assertEquals("For inputs \"Greg\" and \"Daniel\"", "Hello guest", Kata.greet("Greg", "Daniel"));
    }
}