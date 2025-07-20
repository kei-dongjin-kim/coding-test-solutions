package leetcode;

import org.junit.jupiter.api.Test;

public class P1370Test {

    @Test
    void test1() {
        String s = new String("abcdefggfedcbaabcdefg");
        String expected = "abcdefggfedcbaabcdefg";
        P1370 solution = new P1370();
        String actual = solution.sortString(s);
        assert expected.equals(actual);
    }
}
