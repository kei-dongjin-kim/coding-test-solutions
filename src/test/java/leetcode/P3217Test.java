package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P3217Test {

    @Test
    @DisplayName("nums = [1,2,3], head = [1,2,3,4,5,6]")
    void test1() {
        int[] nums = {1, 2, 3};
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode actual = new P3217().modifiedList(nums, head);
        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
