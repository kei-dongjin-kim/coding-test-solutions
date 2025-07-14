package leetcode;

import org.junit.jupiter.api.Test;

public class P1399Test {

    @Test
    void test1() {
        int n = 14;
        int expected = 5;
        P1399 solution = new P1399();
        int actual = solution.countLargestGroup(n);
        assert expected == actual;
    }
}
