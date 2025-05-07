package leetcode;

import org.junit.jupiter.api.Test;

public class P1103Test {

    @Test
    void test1() {
        int candies = 7;
        int num_people = 3;
        int[] expected = new int[] {2, 2, 3};
        P1103 solution = new P1103();
        int[] actual = solution.distributeCandies(candies, num_people);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
