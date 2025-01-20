package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P0916Test {

    @Test
    void test1() {
        String[] words1 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"e","o"};
        List<String> expected = new ArrayList<>();
        expected.add("facebook");
        expected.add("google");
        expected.add("leetcode");
        P0916 solution = new P0916();
        List<String> actual = solution.wordSubsets(words1, words2);
        assert actual.equals(expected);
    }

    @Test
    void test2() {
        String[] words1 = new String[] {"amazon","apple","facebook","google","leetcode"};
        String[] words2 = {"l","e"};
        List<String> expected = new ArrayList<>();
        expected.add("apple");
        expected.add("google");
        expected.add("leetcode");
        P0916 solution = new P0916();
        List<String> actual = solution.wordSubsets(words1, words2);
        assert actual.equals(expected);
    }
}
