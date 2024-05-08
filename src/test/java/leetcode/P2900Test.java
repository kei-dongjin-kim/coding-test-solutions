package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P2900Test {

    @Test
    @DisplayName("words = [o, c, e], groups = [1,0,0]")
    void test1() {
        String[] words = {"o", "c", "e"};
        int[] groups = {1, 0, 0};
        List<String> expected = List.of("o", "c");
        assert new P2900().getLongestSubsequence(words, groups).equals(expected);
    }
}
