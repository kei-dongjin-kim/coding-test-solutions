package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1481Test {

    @Test
    @DisplayName("arr = [5,5,4], k = 1")
    void findLeastNumOfUniqueInts_Test0() {
        int[] arr = {5,5,4};
        int k = 1;
        int expect = 1;
        P1481 solution = new P1481();
        int actual = solution.findLeastNumOfUniqueInts(arr, k);
        assert expect == actual;
    }

    @Test
    @DisplayName("arr = [4,3,1,1,3,3,2], k = 3")
    void findLeastNumOfUniqueInts_Test1() {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        int expect = 2;
        P1481 solution = new P1481();
        int actual = solution.findLeastNumOfUniqueInts(arr, k);
        assert expect == actual;
    }
}
