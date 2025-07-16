package leetcode;

import org.junit.jupiter.api.Test;

public class P1385Test {

    @Test
    void test1() {
        int[] arr1 = new int[] {9, 10, 11};
        int[] arr2 = new int[] {5, 5, 5};
        int d = 5;
        int expected = 1;
        P1385 solution = new P1385();
        int actual = solution.findTheDistanceValue(arr1, arr2, d);
        assert expected == actual;
    }
}
