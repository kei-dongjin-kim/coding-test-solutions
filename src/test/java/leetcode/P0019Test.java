package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0019Test {

    @Test
    @DisplayName("head = [1,2,3,4,5], n = 2")
    void removeNthFromEnd_Test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode actual = new P0019().removeNthFromEnd(head, n);
        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    @DisplayName("head = [1], n = 1")
    void removeNthFromEnd_Test2() {
        ListNode head = new ListNode(1);
        int n = 1;
        ListNode expected = null;
        ListNode actual = new P0019().removeNthFromEnd(head, n);
        assert expected == actual;
    }

    @Test
    @DisplayName("head = [1,2], n = 1")
    void removeNthFromEnd_Test3() {
        ListNode head = new ListNode(1, new ListNode(2));
        int n = 1;
        ListNode expected = new ListNode(1);
        ListNode actual = new P0019().removeNthFromEnd(head, n);
        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
