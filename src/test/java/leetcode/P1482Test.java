package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1482Test {

    @Test
    @DisplayName("bloomDay = [1,20,3,20,2], m = 3, k = 1")
    void test1() {
        int[] bloomDay = {1,20,3,20,2};
        int m = 3;
        int k = 1;
        P1482 solution = new P1482();
        assert solution.minDays(bloomDay, m, k) == 3;
    }
}
