package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0028Test {

    @Test
    @DisplayName("haystack = 0123456789, needle = 345")
    void test1() {
        String haystack = "0123456789";
        String needle = "345";
        int expected = 3;
        int actual = new P0028().strStr(haystack, needle);
        assert expected == actual;
    }
}
