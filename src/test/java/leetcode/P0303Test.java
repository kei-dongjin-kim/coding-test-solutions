package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0303Test {

    @Test
    void test1() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        P0303 numArray = new P0303(nums);
        assert numArray.sumRange(0, 2) == 1;
        assert numArray.sumRange(2, 5) == -1;
        assert numArray.sumRange(0, 5) == -3;
    }
}
