package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1052Test {

    @Test
    @DisplayName("customers = [1,1,1,1,1,1,1,1], grumpy = [0,1,0,1,0,1,0,1], minutes = 3")
    void test1() {
        int[] customers = {1,1,1,1,1,1,1,1};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        P1052 solution = new P1052();
        int actual = solution.maxSatisfied(customers, grumpy, minutes);
        int expected = 6;
        assert expected == actual;
    }
}
