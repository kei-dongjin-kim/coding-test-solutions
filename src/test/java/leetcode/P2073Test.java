package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2073Test {

    @Test
    @DisplayName("tickets = [2,3,2], k = 2")
    void test1() {
        int[] tickets = {2,3,2};
        int k = 2;
        P2073 solution = new P2073();
        assert solution.timeRequiredToBuy(tickets, k) == 6;
    }
}
