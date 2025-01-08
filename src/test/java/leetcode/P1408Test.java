package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1408Test {

    @Test
    void test1() {
        String[] words = {"abc", "def", "ghi", "xxxabcxxx"};
        List<String> expected = new ArrayList<>();
        expected.add("abc");
        P1408 solution = new P1408();
        List<String> actual = solution.stringMatching(words);
        assert expected.containsAll(actual);
        assert actual.containsAll(expected);
    }
}
