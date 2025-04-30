package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class P1078Test {

    @Test
    void test1() {
        String text = "A B A B C A B A B C";
        String first = "A";
        String second = "B";
        String[] expected = new String[] {"A", "C", "A", "C"};
        P1078 solution = new P1078();
        String[] actual = solution.findOcurrences(text, first, second);
        for (int i = 0; i < actual.length; i++) {
            assert expected[i].equals(actual[i]);
        }
    }
}
