package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0205Test {

    @Test
    @DisplayName("s = abb, t = cdd")
    void isIsomorphic_Test1() {
        String s = "abb";
        String t = "cdd";
        P0205 solution = new P0205();
        assert solution.isIsomorphic(s, t);
    }
}
