package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0078Test {

    @Test
    @DisplayName("nums = [1,2,3]")
    void test1() {
        int[] nums = {1, 2, 3};
        P0078 solution = new P0078();
        List<List<Integer>> actual = solution.subsets(nums);
        List<List<Integer>> expected = List.of(
                List.of(),
                List.of(1),
                List.of(2),
                List.of(1, 2),
                List.of(3),
                List.of(1, 3),
                List.of(2, 3),
                List.of(1, 2, 3)
        );
        assert Util.areEqualDoubleList(expected, actual);
    }
}
