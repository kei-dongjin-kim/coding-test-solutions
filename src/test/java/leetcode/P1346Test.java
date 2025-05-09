package leetcode;

import org.junit.jupiter.api.Test;

public class P1346Test {

    @Test
    void test1() {
        int[] arr = new int[] {2, 3, 4, 5};
        boolean expected = true;
        P1346 solution = new P1346();
        boolean actual = solution.checkIfExist(arr);
        assert expected == actual;
    }
}
