package leetcode;

import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P2363Test {

    @Test
    void test1() {
        int[][] items1 = new int[][] {{1, 1}, {2, 1}, {3, 1}};
        int[][] items2 = new int[][] {{1, 9}, {2, 9}, {3, 9}};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        expected.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(10);
        expected.add(list2);
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(10);
        expected.add(list3);
        P2363 solution = new P2363();
        List<List<Integer>> actual = solution.mergeSimilarItems(items1, items2);
        for (int i = 0; i < actual.size(); i++) {
            for (int j = 0; j < actual.get(i).size(); j++) {
                assert actual.get(i).get(j) == actual.get(i).get(j);
            }
        }
    }
}
