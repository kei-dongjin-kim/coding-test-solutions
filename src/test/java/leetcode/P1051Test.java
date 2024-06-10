package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1051Test {

    @Test
    @DisplayName("heights = [3,2,1,4]")
    void test1() {
        int[] heights = {3,2,1,4};
        int expected = 2;
        int actual = new P1051().heightChecker(heights);
        assert actual == expected;
    }
}
