package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P0140Test {

    @Test
    @DisplayName("s = \"catsanddog\", wordDict = [\"cat\",\"cats\",\"and\",\"sand\",\"dog\"]")
    void test1() {
        P0140 solution = new P0140();
        List<String> actual = solution.wordBreak("catsanddog", List.of("cat","cats","and","sand","dog"));
        List<String> expected = new ArrayList<>();
        expected.add("cats and dog");
        expected.add("cat sand dog");
        actual.sort(String::compareTo);
        expected.sort(String::compareTo);
        for (int i=0 ; i<actual.size() ; i++) {
            assert actual.get(i).equals(expected.get(i));
        }
    }
}
