package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2824Test {

    @Test
    void test1() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        int target = 5;
        int expected = 2;
        P2824 solution = new P2824();
        int actual = solution.countPairs(nums, target);
        assert expected == actual;
    }
}
