package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1371Test {

    @Test
    @DisplayName("s = aaeeiioouuu")
    void test1() {
        String s = "aaeeiioouuu";
        int expected = 10;
        int actual = new P1371().findTheLongestSubstring(s);
        assert expected == actual;
    }
}
