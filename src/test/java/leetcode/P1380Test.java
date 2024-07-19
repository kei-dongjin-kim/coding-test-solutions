package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1380Test {

    @Test
    @DisplayName("matrix = [[1,2,3],[4,5,6],[7,8,9]]")
    void test1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> expected = new ArrayList<>();
        expected.add(7);
        P1380 solution = new P1380();
        List<Integer> actual = solution.luckyNumbers(matrix);
        assert(expected.equals(actual));
    }
}
