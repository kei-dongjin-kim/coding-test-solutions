package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2812Test {

    @Test
    @DisplayName("grid = [[0,0,1],[0,0,0],[0,0,0]]")
    void test1() {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(Arrays.asList(0, 0, 1));
        grid.add(Arrays.asList(0, 0, 0));
        grid.add(Arrays.asList(0, 0, 0));
        int expected = 2;
        int actual = new P2812().maximumSafenessFactor(grid);
        assert actual == expected;
    }
}
