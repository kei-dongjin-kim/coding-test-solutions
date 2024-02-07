package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class P0049Test {

    @Test
    @DisplayName("strs = [\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\"]")
    void groupAnagrams_Test1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        P0049 solution = new P0049();
        List<List<String>> actualList = solution.groupAnagrams(strs);
        List<List<String>> expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList("bat"));
        expectedList.add(Arrays.asList("nat", "tan"));
        expectedList.add(Arrays.asList("ate", "eat", "tea"));

        // Sort the inner list and the outer list
        for (List<String> actual : actualList) {
            Collections.sort(actual);
        }
        for (List<String> expected : expectedList) {
            Collections.sort(expected);
        }
        Collections.sort(actualList, (a, b) -> a.toString().compareTo(b.toString()));
        Collections.sort(expectedList, (a, b) -> a.toString().compareTo(b.toString()));
        assert (actualList.equals(expectedList));
    }
}
