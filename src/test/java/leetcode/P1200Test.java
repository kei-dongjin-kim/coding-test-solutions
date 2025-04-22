package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1200Test {

    @Test
    void test1() {
        int[] arr = new int[] {1, 2, 3, 5, 9};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> e1 = new ArrayList<>();
        e1.add(1);
        e1.add(2);
        expected.add(e1);
        List<Integer> e2 = new ArrayList<>();
        e2.add(2);
        e2.add(3);
        expected.add(e2);
        P1200 solution = new P1200();
        List<List<Integer>> actual = solution.minimumAbsDifference(arr);
        assert expected.equals(actual);
    }
}
