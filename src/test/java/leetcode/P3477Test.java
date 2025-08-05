package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P3477Test {

    @Test
    void test1() {
        int[] fruits = new int[] {1, 2, 3, 4, 5};
        int[] baskets = new int[] {3, 4, 5, 1, 2};
        int expected = 2;
        P3477 solution = new P3477();
        int actual = solution.numOfUnplacedFruits(fruits, baskets);
        Assertions.assertEquals(expected, actual);
    }
}
