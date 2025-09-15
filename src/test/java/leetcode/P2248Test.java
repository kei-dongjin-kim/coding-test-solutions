package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2248Test {

    @Test
    void test1() {
        int[][] nums = new int[][] {{5, 4, 3, 2, 1}, {3, 2, 1}, {2, 1}};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        P2248 solution = new P2248();
        List<Integer> list = solution.intersection(nums);
        Assertions.assertEquals(expected, list);
    }
}
