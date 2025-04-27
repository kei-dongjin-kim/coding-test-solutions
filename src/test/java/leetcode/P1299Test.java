package leetcode;

import org.junit.jupiter.api.Test;

public class P1299Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 5, 5, 5, -1};
        P1299 solution = new P1299();
        int[] actual = solution.replaceElements(arr);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i] == actual[i];
        }
    }
}
