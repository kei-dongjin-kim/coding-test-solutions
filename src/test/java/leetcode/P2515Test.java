package leetcode;

import org.junit.jupiter.api.Test;

public class P2515Test {

    @Test
    void test1() {
        String[] words = new String[] {"a", "b", "c", "d", "e", "f"};
        String target = "e";
        int startIndex = 0;
        int expected = 2;
        P2515 solution = new P2515();
        int actual = solution.closestTarget(words, target, startIndex);
        assert actual == expected;
    }
}
