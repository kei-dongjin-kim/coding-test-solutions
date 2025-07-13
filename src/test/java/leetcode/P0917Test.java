package leetcode;

import org.junit.jupiter.api.Test;

public class P0917Test {

    @Test
    void test1() {
        String s = "abcd-efg-hi-j";
        String expected = "jihg-fed-cb-a";
        P0917 solution = new P0917();
        String actual = solution.reverseOnlyLetters(s);
        assert expected.equals(actual);
    }
}
