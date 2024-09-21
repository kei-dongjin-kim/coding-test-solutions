package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1043Test {

    @Test
    @DisplayName("arr = [1,15,7,9,2,5,10], k = 3")
    void maxSumAfterPartitioning_Test1() {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;
        P1043 solution = new P1043();
        assert solution.maxSumAfterPartitioning(arr, k) == 84;
    }

    @Test
    @DisplayName("arr = [1,4,1,5,7,3,6,1,9,9,3], k = 4")
    void maxSumAfterPartitioning_Test2() {
        int[] arr = {1,4,1,5,7,3,6,1,9,9,3};
        int k = 4;
        P1043 solution = new P1043();
        assert solution.maxSumAfterPartitioning(arr, k) == 83;
    }

    @Test
    @DisplayName("arr = [1], k = 1")
    void maxSumAfterPartitioning_Test3() {
        int[] arr = {1};
        int k = 1;
        P1043 solution = new P1043();
        assert solution.maxSumAfterPartitioning(arr, k) == 1;
    }
}
