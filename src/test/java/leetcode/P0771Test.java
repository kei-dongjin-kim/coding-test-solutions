package leetcode;

import org.junit.jupiter.api.Test;

public class P0771Test {

    @Test
    void test1() {
        String jewels = "aA";
        String stones = "xxxAAAxxx";
        int expected = 3;
        P0771 solution = new P0771();
        int actual = solution.numJewelsInStones(jewels, stones);
        assert actual == expected;
    }
}
