package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0846Test {

    @Test
    @DisplayName("hand = [1,2,3,6,2,3,4,7,8], groupSize = 3")
    void test1() {
        int[] hand = {1,2,3,6,2,3,4,7,8};
        int groupSize = 3;
        assert new P0846().isNStraightHand(hand, groupSize);
    }
}
