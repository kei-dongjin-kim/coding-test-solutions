package leetcode;

import org.junit.jupiter.api.Test;

public class P2283Test {

    @Test
    void test1() {
        String num = "122333";
        boolean expected = false;
        P2283 solution = new P2283();
        boolean actual = solution.digitCount(num);
        assert expected == actual;
    }
}
