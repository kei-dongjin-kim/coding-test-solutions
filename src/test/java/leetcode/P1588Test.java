package leetcode;

import org.junit.jupiter.api.Test;

public class P1588Test {

    @Test
    void test1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 605;
        P1588 solution = new P1588();
        int actual = solution.sumOddLengthSubarrays(arr);
        assert expected == actual;
    }
}
