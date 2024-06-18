package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0826Test {

    @Test
    @DisplayName("difficulty = [2,4,6,8], profit = [10,20,30,40], worker = [4,5,6,7,8]")
    void test1() {
        int[] difficulty = {2,4,6,8};
        int[] profit = {10,20,30,40};
        int[] worker = {4,5,6,7,8};
        int expected = 140;
        int actual = new P0826().maxProfitAssignment(difficulty, profit, worker);
        assert(expected == actual);
    }
}
