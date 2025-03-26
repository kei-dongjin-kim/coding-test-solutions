package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2194Test {

    @Test
    void test1() {
        String s = "B3:D5";
        List<String> expected = new ArrayList<>();
        expected.add("B3");
        expected.add("B4");
        expected.add("B5");
        expected.add("C3");
        expected.add("C4");
        expected.add("C5");
        expected.add("D3");
        expected.add("D4");
        expected.add("D5");
        P2194 solution = new P2194();
        List<String> actual = solution.cellsInRange(s);
        for (int i = 0; i < actual.size(); i++) {
            assert expected.get(i).equals(actual.get(i));
        }
    }
}
