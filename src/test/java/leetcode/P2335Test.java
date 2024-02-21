package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2335Test {

    @Test
    @DisplayName("amount = [1,4,2]")
    void fillCups_Test1() {
        int[] amount = {1, 4, 2};
        int expected = 4;
        P2335 solution = new P2335();
        int actual = solution.fillCups(amount);
        assert expected == actual;
    }

    @Test
    @DisplayName("amount = [5,4,4]")
    void fillCups_Test2() {
        int[] amount = {5, 4, 4};
        int expected = 7;
        P2335 solution = new P2335();
        int actual = solution.fillCups(amount);
        assert expected == actual;
    }
}
