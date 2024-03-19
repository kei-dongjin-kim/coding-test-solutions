package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0452Test {

    @Test
    @DisplayName("points = [[10,16],[2,8],[1,6],[7,12]]")
    void findMinArrowShots_Test1() {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int expected = 2;
        int actual = new P0452().findMinArrowShots(points);
        assert expected == actual;
    }
}
