package leetcode;

import org.junit.jupiter.api.Test;

public class P1903Test {

    @Test
    void test1() {
        String num = "1234567890";
        String expected = "123456789";
        P1903 solution = new P1903();
        String actual = solution.largestOddNumber(num);
        assert expected.equals(actual);
    }
}
