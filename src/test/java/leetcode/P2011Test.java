package leetcode;

import org.junit.jupiter.api.Test;

public class P2011Test {

    @Test
    void test1() {
        String[] operations = new String[] {"++X", "X++", "--X", "X--"};
        int expected = 0;
        P2011 solution = new P2011();
        int actual = solution.finalValueAfterOperations(operations);
        assert expected == actual;
    }
}
