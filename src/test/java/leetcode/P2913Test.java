package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2913Test {

    @Test
    void test1() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        int expected = 20;
        P2913 solution = new P2913();
        int actual = solution.sumCounts(nums);
        Assertions.assertEquals(expected, actual);
    }
}
