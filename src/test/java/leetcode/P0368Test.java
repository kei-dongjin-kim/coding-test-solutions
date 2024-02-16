package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0368Test {

    @Test
    @DisplayName("nums = [1,2,3]")
    void largestDivisibleSubset_Test0() {
        int[] nums = {1,2,3};
        int[] expect = {1,2};
        P0368 solution = new P0368();
        List<Integer> actual = solution.largestDivisibleSubset(nums);
        for (int i=0 ; i<expect.length ; i++) {
            assert expect[i] == actual.get(i);
        }
    }

    @Test
    @DisplayName("nums = [1,2,4,8]")
    void largestDivisibleSubset_Test1() {
        int[] nums = {1,2,4,8};
        int[] expect = {1,2,4,8};
        P0368 solution = new P0368();
        List<Integer> actual = solution.largestDivisibleSubset(nums);
        for (int i=0 ; i<expect.length ; i++) {
            assert expect[i] == actual.get(i);
        }
    }

    @Test
    @DisplayName("nums = [3,4,16,8]")
    void largestDivisibleSubset_Test2() {
        int[] nums = {3,4,16,8};
        int[] expect = {4,8,16};
        P0368 solution = new P0368();
        List<Integer> actual = solution.largestDivisibleSubset(nums);
        for (int i=0 ; i<expect.length ; i++) {
            assert expect[i] == actual.get(i);
        }
    }
}
