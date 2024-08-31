package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0389Test {

    @Test
    @DisplayName("s = abc, t = abcd")
    void test1() {
        String s = "abc";
        String t = "abcd";
        char expected = 'd';
        char actual = new P0389().findTheDifference(s, t);
        assert expected == actual;
    }
}
