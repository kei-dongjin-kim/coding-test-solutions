package leetcode;

import org.junit.jupiter.api.Test;

public class P3280Test {

    @Test
    void test1() {
        String date = "2025-01-01";
        String expected = "11111101001-1-1";
        P3280 solution = new P3280();
        String actual = solution.convertDateToBinary(date);
        assert expected.equals(actual);
    }
}
