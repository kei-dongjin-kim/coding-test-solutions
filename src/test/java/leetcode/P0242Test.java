package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0242Test {

    @Test
    @DisplayName("s = abc, t = cba")
    void test1() {
        String s = "abc";
        String t = "cba";
        boolean expected = true;
        boolean actual = new P0242().isAnagram(s, t);
        assert expected == actual;
    }

    @Test
    @DisplayName("s = abc, t = ccc")
    void test2() {
        String s = "abc";
        String t = "ccc";
        boolean expected = false;
        boolean actual = new P0242().isAnagram(s, t);
        assert expected == actual;
    }
}
