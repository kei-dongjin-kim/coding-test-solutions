package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1143Test {

    @Test
    @DisplayName("text1 = ezupkr, text2 = ubmrapg")
    void longestCommonSubsequence() {
        P1143 calculator = new P1143();
        assert 2 == calculator.longestCommonSubsequence("ezupkr", "ubmrapg");
    }
}
