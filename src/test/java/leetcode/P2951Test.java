package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class P2951Test {

    @Test
    void test1() {
        int[] mountain = new int[] {1, 2, 3, 2, 1, 2, 3, 2, 1};
        List<Integer> expected = Arrays.asList(2, 6);
        P2951 solution = new P2951();
        List<Integer> actual = solution.findPeaks(mountain);
        Assertions.assertEquals(expected, actual);
    }
}
