package leetcode;

import org.junit.jupiter.api.Test;

public class P2325Test {

    @Test
    void test1() {
        String key = "aaabbbcccdef";
        String message = "abcdef";
        String expected = "abcdef";
        P2325 solution = new P2325();
        String actual = solution.decodeMessage(key, message);;
        assert expected.equals(actual);
    }
}
