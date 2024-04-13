package leetcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0042Test {

    @Test
    @DisplayName("height = [0,1,0,2,1,0,1,3,2,1,2,1]")
    void test1() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        P0042 solution = new P0042();
        assert solution.trap(height) == 6;
    }
}
