package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2859Test {

    @Test
    void test1() {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        int k = 1;
        int expected = 10;
        P2859 solution = new P2859();
        int actual = solution.sumIndicesWithKSetBits(nums, k);
        assert expected == actual;
    }
}
