package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0506Test {

    @Test
    @DisplayName("score = [5,4,3,2,1]")
    void findRelativeRanks_Test1() {
        int[] score = {5,4,3,2,1};
        P0506 solution = new P0506();
        String[] result = solution.findRelativeRanks(score);
        String[] expected = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        assert Arrays.equals(expected, result);
    }

    @Test
    @DisplayName("score = [10,3,8,9,4]")
    void findRelativeRanks_Test2() {
        int[] score = {10,3,8,9,4};
        P0506 solution = new P0506();
        String[] result = solution.findRelativeRanks(score);
        String[] expected = {"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"};
        assert Arrays.equals(expected, result);
    }
}
