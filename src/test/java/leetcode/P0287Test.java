package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0287Test {

    @Test
    @DisplayName("nums = [1,3,4,2,2]")
    void findDuplicate_Test1() {
        int[] nums = {1, 3, 4, 2, 2};
        int expected = 2;
        int actual = new P0287().findDuplicate(nums);
        assert expected == actual;
    }
}
