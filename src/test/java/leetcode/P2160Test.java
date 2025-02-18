package leetcode;

import org.junit.jupiter.api.Test;

public class P2160Test {

    @Test
    void test1() {
        int num = 1234;
        int expected = 37;
        P2160 solution = new P2160();
        int actual = solution.minimumSum(num);
        assert expected == actual;
    }
}
