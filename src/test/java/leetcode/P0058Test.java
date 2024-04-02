package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0058Test {

    @Test
    @DisplayName("s = '   Hello World   ', expected = 5")
    void lengthOfLastWord_Test1() {
        String s = "   Hello World   ";
        int expected = 5;
        int actual = new P0058().lengthOfLastWord(s);
        assert expected == actual;
    }
}
