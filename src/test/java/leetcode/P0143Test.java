package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0143Test {

    @Test
    @DisplayName("head = [1,2,3,4]")
    void reorderList_Test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(3))));
        P0143 solution = new P0143();
        solution.reorderList(head);
        while (head != null) {
            assert head.val == expected.val;
            head = head.next;
            expected = expected.next;
        }
    }

    @Test
    @DisplayName("head = [1,2,3,4,5]")
    void reorderList_Test2() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(5, new ListNode(2, new ListNode(4, new ListNode(3)))));
        P0143 solution = new P0143();
        solution.reorderList(head);
        while (head != null) {
            assert head.val == expected.val;
            head = head.next;
            expected = expected.next;
        }
    }
}