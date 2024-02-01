package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0739Test {

    @Test
    @DisplayName("temperatures = [73, 74, 75, 71, 69, 72, 76, 73]")
    void dailyTemperatures_Test1() {
        P0739 solution = new P0739();
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] answer = {1, 1, 4, 2, 1, 1, 0, 0};
        assert(Arrays.equals(solution.dailyTemperatures(temperatures), answer));
    }

    @Test
    @DisplayName("temperatures = [30, 40, 50, 60]")
    void dailyTemperatures_Test2() {
        P0739 solution = new P0739();
        int[] temperatures = {30, 40, 50, 60};
        int[] answer = {1, 1, 1, 0};
        assert(Arrays.equals(solution.dailyTemperatures(temperatures), answer));
    }
}
