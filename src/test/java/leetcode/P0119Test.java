package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class P0119Test {

    @Test
    @DisplayName("rowIndex = 3")
    void testGetRow() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(3);
        expected.add(1);

        P0119 solution = new P0119();
        List<Integer> actual = solution.getRow(3);
        assert(expected.equals(actual));
    }

    @Test
    @DisplayName("rowIndex = 0")
    void testGetRow2() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        P0119 solution = new P0119();
        List<Integer> actual = solution.getRow(0);
        assert(expected.equals(actual));
    }

    @Test
    @DisplayName("rowIndex = 1")
    void testGetRow3() {
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);

        P0119 solution = new P0119();
        List<Integer> actual = solution.getRow(1);
        assert(expected.equals(actual));
    }
}
