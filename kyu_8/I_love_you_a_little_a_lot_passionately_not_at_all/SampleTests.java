package kyu_8.I_love_you_a_little_a_lot_passionately_not_at_all;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SampleTests {
    @Test
    public void test1() {
        assertEquals(Sid.howMuchILoveYou(1), "I love you");
        assertEquals(Sid.howMuchILoveYou(2), "a little");
        assertEquals(Sid.howMuchILoveYou(6), "not at all");
        assertEquals(Sid.howMuchILoveYou(7), "I love you");
    }
}