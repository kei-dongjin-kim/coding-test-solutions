package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0451Test {

    @Test
    @DisplayName("s = tree")
    void frequencySort_Test1() {
        String s = "tree";
        String expected1 = "eert";
        String expected2 = "eetr";
        String actual = new P0451().frequencySort(s);
        assert(expected1.equals(actual) || expected2.equals(actual));
    }
}
