package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0191Test {

    @Test
    @DisplayName("n = 7")
    void test1() {
        int n = 7;
        int expected = 3;
        P0191 solution = new P0191();
        assert(solution.hammingWeight(n) == expected);
    }
}
