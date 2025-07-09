package leetcode;

import org.junit.jupiter.api.Test;

public class P3386Test {

    @Test
    void test1() {
        int[][] events = new int[][] {{1, 1}, {2, 2}, {3, 4}, {4, 8}, {5, 100}};
        int expected = 5;
        P3386 solution = new P3386();
        int actual = solution.buttonWithLongestTime(events);
        assert expected == actual;
    }
}
