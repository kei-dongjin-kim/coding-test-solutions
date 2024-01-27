package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0392Test {

    @Test
    @DisplayName("s = abc, t = ahbgdc")
    void isSubsequence1() {
        P0392 solution = new P0392();
        assert solution.isSubsequence("abc", "ahbgdc");
    }

    @Test
    @DisplayName("s = axc, t = ahbgdc")
    void isSubsequence2() {
        P0392 solution = new P0392();
        assert !solution.isSubsequence("axc", "ahbgdc");
    }
}
