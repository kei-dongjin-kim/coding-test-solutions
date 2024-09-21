package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1002Test {

    @Test
    @DisplayName("words = [\"bella\",\"label\",\"roller\"]")
    void test1() {
        String[] words = {"bella", "label", "roller"};
        P1002 solution = new P1002();
        List<String> actual = solution.commonChars(words);
        List<String> expected = List.of("e", "l", "l");
        Set<String> actualSet = new HashSet<>(actual);
        Set<String> expectedSet = new HashSet<>(expected);
        assert expectedSet.equals(actualSet);
    }
}
