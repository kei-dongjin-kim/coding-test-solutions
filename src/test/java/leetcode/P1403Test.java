package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1403Test {

    @Test
    void test1() {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        List<Integer> expected =  new ArrayList<>();
        expected.add(7);
        expected.add(6);
        expected.add(5);
        P1403 p1403 = new P1403();
        List<Integer> actual = p1403.minSubsequence(nums);
        Assertions.assertEquals(expected, actual);
    }
}
