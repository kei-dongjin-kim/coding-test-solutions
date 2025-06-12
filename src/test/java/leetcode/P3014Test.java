package leetcode;

import org.junit.jupiter.api.Test;

public class P3014Test {

    @Test
    void test1() {
        String word = "abcdefghi";
        int expected = 10;
        P3014 solution = new P3014();
        int actual = solution.minimumPushes(word);
        assert expected == actual;
    }
}
