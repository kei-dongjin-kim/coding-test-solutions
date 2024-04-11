package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P0950Test {

    @Test
    @DisplayName("deck = [17,13,11,2,3,5,7]")
    void test1() {
        int[] deck = {17,13,11,2,3,5,7};
        int[] expected = {2,13,3,11,5,17,7};
        assert Arrays.equals(new P0950().deckRevealedIncreasing(deck), expected);
    }
}
