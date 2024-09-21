package leetcode;

import org.junit.jupiter.api.Test;

public class P2042Test {

    @Test
    void areNumbersAscending_Test1() {
        P2042 p2042 = new P2042();
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        boolean result = p2042.areNumbersAscending(s);
        assert(result);
    }

    @Test
    void areNumbersAscending_Test2() {
        P2042 p2042 = new P2042();
        String s = "hello world 5 x 5";
        boolean result = p2042.areNumbersAscending(s);
        assert(!result);
    }

    @Test
    void areNumbersAscending_Test3() {
        P2042 p2042 = new P2042();
        String s = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        boolean result = p2042.areNumbersAscending(s);
        assert(!result);
    }
}
