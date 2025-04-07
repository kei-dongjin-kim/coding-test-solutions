package leetcode;

import org.junit.jupiter.api.Test;

public class P2678Test {

    @Test
    void test1() {
        String[] details = new String[] {"0000000000M5900", "0000000000M6000", "0000000000M6100"};
        int expected = 1;
        P2678 solution = new P2678();
        int actual = solution.countSeniors(details);
        assert expected == actual;
    }
}
