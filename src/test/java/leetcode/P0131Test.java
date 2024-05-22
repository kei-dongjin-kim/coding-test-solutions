package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class P0131Test {

    @Test
    @DisplayName("s = aab")
    void test1() {
        String s = "aab";
        P0131 solution = new P0131();
        List<List<String>> actual = solution.partition(s);
        List<List<String>> expected = List.of(
                List.of("a", "a", "b"),
                List.of("aa", "b")
        );
        for (int i = 0; i < expected.size(); i++) {
            List<String> e = expected.get(i);
            List<String> a = actual.get(i);
            for (int j = 0; j < e.size(); j++) {
                assert e.get(j).equals(a.get(j));
            }
        }
    }
}
