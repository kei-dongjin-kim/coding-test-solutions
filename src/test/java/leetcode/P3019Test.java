package leetcode;

import org.junit.jupiter.api.Test;

public class P3019Test {

    @Test
    void test1() {
        String s = "AaBbCcDdEeFfGg";
        int expected = 6;
        P3019 solution = new P3019();
        int actual = solution.countKeyChanges(s);
        assert actual == expected;
    }
}
