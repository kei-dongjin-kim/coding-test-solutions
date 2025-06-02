package leetcode;

import org.junit.jupiter.api.Test;

public class P1629Test {

    @Test
    void test1() {
        int[] releaseTimes = new int[] {1, 2, 3, 4, 5, 16, 17};
        String keysPressed = "abcdeab";
        char expected = 'a';
        P1629 solution = new P1629();
        char actual = solution.slowestKey(releaseTimes, keysPressed);
        assert expected == actual;
    }
}
