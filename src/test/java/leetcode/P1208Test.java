package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1208Test {

    @Test
    @DisplayName("s = abcd, t = bcdf, maxCost = 3")
    void test1() {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int expected = 3;
        int actual = new P1208().equalSubstring(s, t, maxCost);
        assert actual == expected;
    }

    @Test
    @DisplayName("s = krrgw, t = zjxss, maxCost = 19")
    void test2() {
        String s = "krrgw";
        String t = "zjxss";
        int maxCost = 19;
        int expected = 2;
        int actual = new P1208().equalSubstring(s, t, maxCost);
        assert actual == expected;
    }
}
