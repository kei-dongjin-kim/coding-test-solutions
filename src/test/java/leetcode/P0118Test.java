package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0118Test {

    @Test
    @DisplayName("numRows = 5")
    void testGenerate1() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));

        P0118 solution = new P0118();
        assert(expected.equals(solution.generate(5)));
    }

    @Test
    @DisplayName("numRows = 1")
    void testGenerate2() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));

        P0118 solution = new P0118();
        assert(expected.equals(solution.generate(1)));
    }
}
