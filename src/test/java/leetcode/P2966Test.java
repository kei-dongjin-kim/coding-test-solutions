package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class P2966Test {

    @Test
    @DisplayName("nums = [1,3,4,8,7,9,3,5,1], k = 2")
    void divideArray_Test1() {
        P2966 p2966 = new P2966();
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] actual = p2966.divideArray(nums, k);
        int[][] expected = {{1,1,3},{3,4,5},{7,8,9}};
        assertArrayEquals(expected, actual);
    }
}
