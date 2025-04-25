package leetcode;

import org.junit.jupiter.api.Test;

public class P1184Test {

    @Test
    void test1() {
        int[] distance = new int[] {100, 1, 1, 1, 1, 1};
        int start = 0;
        int destination = 1;
        int expected = 5;
        P1184 solution = new P1184();
        int actual = solution.distanceBetweenBusStops(distance, start, destination);
        assert expected == actual;
    }
}
