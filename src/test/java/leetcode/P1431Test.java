package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1431Test {

    @Test
    void test1() {
        int[] candies = new int[] {1, 2, 3, 4, 5};
        int extraCandies = 2;
        List<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(true);
        expected.add(true);
        expected.add(true);
        P1431 solution = new P1431();
        List<Boolean> actual = solution.kidsWithCandies(candies, extraCandies);
        for (int i = 0; i < actual.size(); i++) {
            assert expected.get(i) == actual.get(i);
        }
    }
}
