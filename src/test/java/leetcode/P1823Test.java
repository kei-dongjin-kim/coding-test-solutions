package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1823Test {

    @Test
    @DisplayName("n = 5, k = 3")
    void test1() {
        int n = 5;
        int k = 3;
        int expected = 4;
        int actual = new P1823().findTheWinner(n, k);
        assert expected == actual;
    }
}
