package leetcode;

import org.junit.jupiter.api.Test;

public class P1313Test {

    @Test
    void test1() {
        int[] nums = new int[] {2, 1, 3, 2};
        int[] expected = new int[] {1, 1, 2, 2, 2};
        P1313 solution = new P1313();
        int[] actual = solution.decompressRLElist(nums);
        assert expected.length == actual.length;
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
