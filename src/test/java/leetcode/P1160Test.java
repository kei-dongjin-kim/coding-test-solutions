package leetcode;

import org.junit.jupiter.api.Test;

public class P1160Test {

    @Test
    void test1() {
        String[] words = new String[] {"abc", "axbycz", "efg", "hij", "ab"};
        String chars = "abc";
        int expected = 5;
        P1160 solution = new P1160();
        int actual = solution.countCharacters(words, chars);
        assert expected == actual;
    }
}
