package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1614Test {

    @Test
    @DisplayName("s = (1+(2*3)+((8)/4))+1")
    void maxDepth_Test1() {
        String s = "(1+(2*3)+((8)/4))+1";
        int expected = 3;
        int actual = new P1614().maxDepth(s);
        assert expected == actual;
    }
}
