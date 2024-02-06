package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2016Test {

    @Test
    @DisplayName("[7,1,5,4]")
    void maximumDifference_Test1() {
        int[] nums = {7,1,5,4};
        P2016 solution = new P2016();
        int actual = solution.maximumDifference(nums);
        assert actual == 4;
    }

    @Test
    @DisplayName("[9,4,3,2]")
    void maximumDifference_Test2() {
        int[] nums = {9,4,3,2};
        P2016 solution = new P2016();
        int actual = solution.maximumDifference(nums);
        assert actual == -1;
    }

    @Test
    @DisplayName("[1,5,2,10]")
    void maximumDifference_Test3() {
        int[] nums = {1,5,2,10};
        P2016 solution = new P2016();
        int actual = solution.maximumDifference(nums);
        assert actual == 9;
    }
}
