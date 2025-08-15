package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0859Test {

    @Test
    void test1() {
        String s = "abc";
        String goal = "acb";
        boolean expected = true;
        P0859 solution = new P0859();
        boolean actual = solution.buddyStrings(s, goal);
        Assertions.assertEquals(expected, actual);
    }
}
