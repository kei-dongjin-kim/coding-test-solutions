package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0344Test {

    @Test
    @DisplayName("s = ['h','e','l','l','o']")
    void test1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] expected = {'o', 'l', 'l', 'e', 'h'};
        char[] actual = new P0344().reverseString(s);
        for (int i=0 ; i<actual.length ; i++) {
            assert actual[i] == expected[i];
        }
    }
}
