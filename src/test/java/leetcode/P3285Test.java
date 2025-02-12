package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P3285Test {

    @Test
    void test1() {
        int[] height = new int[] {6, 5, 6, 5};
        int threshold = 5;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        P3285 solution = new P3285();
        List<Integer> actual = solution.stableMountains(height, threshold);
        for (int i = 0; i < actual.size(); i++) {
            assert expected.get(i).equals(actual.get(i));
        }
    }
}
