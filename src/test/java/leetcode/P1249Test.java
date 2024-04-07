package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1249Test {

    @Test
    @DisplayName("s = ))((")
    void minRemoveToMakeValid_Test1() {
        P1249 solution = new P1249();
        String s = "))((";
        String expected = "";
        assert(expected.equals(solution.minRemoveToMakeValid(s)));
    }
}
