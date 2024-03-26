package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P0442Test {

    @Test
    @DisplayName("nums = [4,3,2,7,8,2,3,1]")
    void findDuplicates_Test1() {
        int[] nums = {4,3,2,7,8,2,3,1};
        P0442 solution = new P0442();
        List<Integer> actual = solution.findDuplicates(nums);
        List<Integer> expected = List.of(2, 3);
        assertEquals(expected, actual);
    }
}
