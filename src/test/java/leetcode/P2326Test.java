package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class P2326Test {

    @Test
    @DisplayName("m = 3, n = 3, head = [1,2,3,4,5,6,7,8]")
    void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8))))))));
        int m = 3;
        int n = 3;
        int[][] expected = new int[][] {
            {1, 2, 3},
            {8, -1, 4},
            {7, 6, 5}
        };
        assert Arrays.deepEquals(new P2326().spiralMatrix(m, n, head), expected);
    }
}
