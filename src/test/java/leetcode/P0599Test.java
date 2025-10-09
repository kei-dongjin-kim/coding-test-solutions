package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P0599Test {

    @Test
    void test1() {
        String[] list1 = new String[] {"a", "b", "c"};
        String[] list2 = new String[] {"x", "y", "z", "a", "b", "c"};
        String[] expected = new String[] {"a"};
        P0599 solution = new P0599();
        String[] actual = solution.findRestaurant(list1, list2);
        Assertions.assertArrayEquals(expected, actual);
    }
}
