package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1701Test {

    @Test
    @DisplayName("customers = [[1,3],[3,2],[5,2]]")
    void test1() {
        int[][] customers = {{1, 3}, {3, 2}, {5, 2}};
        P1701 solution = new P1701();
        double actual = solution.averageWaitingTime(customers);
        double expected = 3.0;
        assert expected == actual;
    }
}
