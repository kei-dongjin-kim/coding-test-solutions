package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0874Test {

    @Test
    @DisplayName("commands = [4,-1,4,-2,4], obstacles = [[2,4]]")
    void test1() {
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};
        int expected = 65;
        P0874 solution = new P0874();
        int actual = solution.robotSim(commands, obstacles);
        System.out.println("Expected: " + expected);
        System.out.println("Actual: " + actual);
        assert expected == actual;
    }
}
