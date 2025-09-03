package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P2446Test {

    @Test
    void test1() {
        String[] event1 = new String[] {"09:00", "11:00"};
        String[] event2 = new String[] {"10:00", "12:00"};
        boolean expected = true;
        P2446 solution = new P2446();
        boolean actual = solution.haveConflict(event1, event2);
        Assertions.assertEquals(expected, actual);
    }
}
