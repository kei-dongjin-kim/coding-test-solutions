package leetcode;

import org.junit.jupiter.api.Test;

public class P2525Test {

    @Test
    void test1() {
        int length = 100;
        int width = 100;
        int height = 100;
        int mass = 100;
        String expected = "Heavy";
        P2525 solution = new P2525();
        String actual = solution.categorizeBox(length, width, height, mass);
        assert expected.equals(actual);
    }
}
