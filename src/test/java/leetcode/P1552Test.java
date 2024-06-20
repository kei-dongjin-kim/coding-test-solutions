package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1552Test {

    @Test
    @DisplayName("position = [3,2,1,1000000000], m = 3")
    void test1() {
        int[] position = {3, 2, 1, 1000000000};
        int m = 3;
        P1552 solution = new P1552();
        int expected = 2;
        int actual = solution.maxDistance(position, m);
        assert expected == actual;
    }
}
