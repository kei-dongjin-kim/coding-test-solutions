package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0206Test {

    @Test
    @DisplayName("head = [1,2,3,4,5]")
    void reverseList_Test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        P0206 solution = new P0206();
        ListNode actual = solution.reverseList(head);

        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
