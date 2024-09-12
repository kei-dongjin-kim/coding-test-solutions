package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1684Test {

    @Test
    @DisplayName("allowed = abc, words = [a, b, c, z]")
    void test1() {
        String allowed = "abc";
        String[] words = {"a", "b", "c", "z"};
        int expected = 3;
        int actual = new P1684().countConsistentStrings(allowed, words);
        assert actual == expected;
    }
}
