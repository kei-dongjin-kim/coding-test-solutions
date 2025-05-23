package leetcode;

import org.junit.jupiter.api.Test;

public class P1704Test {

    @Test
    void test1() {
        String s = "aaaxxxyyyeee";
        boolean expected = true;
        P1704 solution = new P1704();
        boolean actual = solution.halvesAreAlike(s);
        assert expected == actual;
    }
}
