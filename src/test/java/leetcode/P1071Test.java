package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1071Test {

    @Test
    void test1() {
        String str1 = "ABCDEABCDEABCDE";
        String str2 = "ABCDEABCDE";
        String expected = "ABCDE";
        P1071 solution = new P1071();
        String actual = solution.gcdOfStrings(str1, str2);
        Assertions.assertEquals(expected, actual);
    }
}
