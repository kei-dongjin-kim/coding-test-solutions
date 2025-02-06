package leetcode;

import org.junit.jupiter.api.Test;

public class P1790Test {

    @Test
    public void test() {
        String s1 = "abcd";
        String s2 = "abdc";
        boolean expected = true;
        P1790 solution = new P1790();
        boolean actual = solution.areAlmostEqual(s1, s2);
        assert expected == actual;
    }
}
