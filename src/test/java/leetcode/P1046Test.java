package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1046Test {

    @Test
    @DisplayName("stones = [2,7,4,1,8,1]")
    void lastStoneWeight_Test1() {
        int[] stones = {2,7,4,1,8,1};
        int expected = 1;
        assert new P1046().lastStoneWeight(stones) == expected;
    }
}
