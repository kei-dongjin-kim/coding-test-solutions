package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0003Test {

    @Test
    @DisplayName("abcabcbb")
    void lengthOfLongestSubstring1() {
        P0003 p0003 = new P0003();
        String s = "abcabcbb";
        assert (p0003.lengthOfLongestSubstring(s) == 3);
    }

    @Test
    @DisplayName("bbbbb")
    void lengthOfLongestSubstring2() {
        P0003 p0003 = new P0003();
        String s = "bbbbb";
        assert (p0003.lengthOfLongestSubstring(s) == 1);
    }

    @Test
    @DisplayName("pwwkew")
    void lengthOfLongestSubstring3() {
        P0003 p0003 = new P0003();
        String s = "pwwkew";
        assert (p0003.lengthOfLongestSubstring(s) == 3);
    }
}
