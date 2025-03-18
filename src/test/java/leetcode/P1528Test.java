package leetcode;

import org.junit.jupiter.api.Test;

public class P1528Test {

    @Test
    void test1() {
        String s = "cbafedihg";
        int[] indices = new int[] {2, 1, 0, 5, 4, 3, 8, 7, 6};
        String expected = "abcdefghi";
        P1528 solution = new P1528();
        String actual = solution.restoreString(s, indices);
        assert expected.equals(actual);
    }
}
