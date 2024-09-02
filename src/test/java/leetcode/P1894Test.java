package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1894Test {

    @Test
    @DisplayName("chalk = [1,1,1], k = 5")
    void test1() {
        int[] chalk = {1, 1, 1};
        int k = 5;
        int expected = 2;
        int actual = new P1894().chalkReplacer(chalk, k);
        assert expected == actual;
    }
}
