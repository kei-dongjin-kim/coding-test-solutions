package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2558Test {

    @Test
    @DisplayName("gifts = [25,64,9,4,100], k = 4")
    void pickGifts_Test1() {
        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;
        P2558 solution = new P2558();
        long actual = solution.pickGifts(gifts, k);
        long expected = 29;
        assert actual == expected;
    }

    @Test
    @DisplayName("gifts = [1,1,1,1], k = 4")
    void pickGifts_Test2() {
        int[] gifts = {1, 1, 1, 1};
        int k = 4;
        P2558 solution = new P2558();
        long actual = solution.pickGifts(gifts, k);
        long expected = 4;
        assert actual == expected;
    }
}
