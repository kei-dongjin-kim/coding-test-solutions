package leetcode;

import org.junit.jupiter.api.Test;

public class P2383Test {

    @Test
    void test1() {
        int initialEnergy = 1;
        int initialExperience = 1;
        int[] energy = new int[] {1, 1, 1, 1};
        int[] experience = new int[] {1, 1, 1, 1};
        int expected = 5;
        P2383 solution = new P2383();
        int actual = solution.minNumberOfHours(initialEnergy, initialExperience, energy, experience);
        assert expected == actual;
    }
}
