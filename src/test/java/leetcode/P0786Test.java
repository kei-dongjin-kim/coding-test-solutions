package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0786Test {

    @Test
    @DisplayName("arr = [1,7], k = 1")
    void test1() {
        int[] arr = {1, 7};
        int k = 1;
        int[] expected = {1, 7};
        int[] actual = new P0786().kthSmallestPrimeFraction(arr, k);
        assert Arrays.equals(actual, expected);
    }
}
