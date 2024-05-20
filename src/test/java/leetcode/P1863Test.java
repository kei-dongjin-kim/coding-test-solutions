package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1863Test {

    @Test
    @DisplayName("nums = [5,1,6]")
    void test1() {
        int[] nums = {5, 1, 6};
        int expected = 28;
        int actual = new P1863().subsetXORSum(nums);
        assert expected == actual;
    }
}
