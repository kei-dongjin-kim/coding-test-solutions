package leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P2215Test {

    @Test
    void test1() {
        int[] nums1 = {1, 1, 2, 3, 5};
        int[] nums2 = {1, 2, 4, 4, 6};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        expected.add(list1);
        expected.add(list2);
        P2215 solution = new P2215();
        List<List<Integer>> actual = solution.findDifference(nums1, nums2);
        assert expected.equals(actual);
    }
}
