package leetcode;

import org.junit.jupiter.api.Test;

public class P2496Test {

    @Test
    void test1() {
        String[] strs = new String[] {"2", "001", "test"};
        int expected = 4;
        P2496 solution = new P2496();
        int actual = solution.maximumValue(strs);
        assert expected == actual;
    }
}
