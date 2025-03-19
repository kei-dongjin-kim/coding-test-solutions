package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1773Test {

    @Test
    void test1() {
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        item1.add("a");
        item1.add("b");
        item1.add("c");
        items.add(item1);
        List<String> item2 = new ArrayList<>();
        item2.add("d");
        item2.add("e");
        item2.add("f");
        items.add(item2);
        List<String> item3 = new ArrayList<>();
        item3.add("g");
        item3.add("h");
        item3.add("i");
        String ruleKey = "name";
        String ruleValue = "f";
        int expected = 1;
        P1773 solution = new P1773();
        int actual = solution.countMatches(items, ruleKey, ruleValue);
        assert actual == expected;
    }
}
