package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0948Test {

    @Test
    @DisplayName("tokens = [100], power = 50")
    void bagOfTokensScore_Test1() {
        int[] tokens = {100};
        int power = 50;
        int expected = 0;
        int actual = new P0948().bagOfTokensScore(tokens, power);
        assert(expected == actual);
    }

    @Test
    @DisplayName("tokens = [100, 200], power = 150")
    void bagOfTokensScore_Test2() {
        int[] tokens = {100, 200};
        int power = 150;
        int expected = 1;
        int actual = new P0948().bagOfTokensScore(tokens, power);
        assert(expected == actual);
    }

    @Test
    @DisplayName("tokens = [100, 200, 300, 400], power = 200")
    void bagOfTokensScore_Test3() {
        int[] tokens = {100, 200, 300, 400};
        int power = 200;
        int expected = 2;
        int actual = new P0948().bagOfTokensScore(tokens, power);
        assert(expected == actual);
    }
}
