package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1260Test {

    @Test
    void test1() {
        int[][] grid = new int[][] { {9, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        int k = 1;
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(9);
        list1.add(1);
        expected.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(5);
        list3.add(6);
        list3.add(7);
        expected.add(list3);
        P1260 solution = new P1260();
        List<List<Integer>> actual = solution.shiftGrid(grid, k);
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < actual.get(i).size(); j++) {
                assert expected.get(i).get(j) == actual.get(i).get(j);
            }
        }
    }
}
