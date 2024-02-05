package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0076Test {

    @Test
    @DisplayName("s = ADOBECODEBANC, t = ABC")
    void minWindow_Test1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        String result = new P0076().minWindow(s, t);
        assert(expected.equals(result));
    }

    @Test
    @DisplayName("s = a, t = a")
    void minWindow_Test2() {
        String s = "a";
        String t = "a";
        String expected = "a";
        String result = new P0076().minWindow(s, t);
        assert(expected.equals(result));
    }

    @Test
    @DisplayName("s = a, t = aa")
    void minWindow_Test3() {
        String s = "a";
        String t = "aa";
        String expected = "";
        String result = new P0076().minWindow(s, t);
        assert(expected.equals(result));
    }

    @Test
    @DisplayName("s = ab, t = b")
    void minWindow_Test4() {
        String s = "ab";
        String t = "b";
        String expected = "b";
        String result = new P0076().minWindow(s, t);
        assert(expected.equals(result));
    }

    @Test
    @DisplayName("s = cabwefgewcwaefgcf, t = cae")
    void minWindow_Test5() {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        String expected = "cwae";
        String result = new P0076().minWindow(s, t);
        assert(expected.equals(result));
    }
}
