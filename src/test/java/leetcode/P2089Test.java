package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P2089Test {

    @Test
    void test1() {
        int[] nums = new int[] {0, 1, 2, 3, 4, 5, 6};
        int target = 5;
        List<Integer> expected = List.of(5);
        P2089 solution = new P2089();
        List<Integer> actual = solution.targetIndices(nums, target);
        Assertions.assertEquals(expected, actual);
    }
}
