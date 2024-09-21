package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1171Test {

    @Test
    @DisplayName("head = [1,2,-3,3,1]")
    void removeZeroSumSublists_Test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(-3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(1);
        P1171 solution = new P1171();
        ListNode result = solution.removeZeroSumSublists(head);
        assert 3 == result.val;
        assert 1 == result.next.val;
    }

    @Test
    @DisplayName("head = [1,2,3,-3,4]")
    void removeZeroSumSublists_Test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(4);
        P1171 solution = new P1171();
        ListNode result = solution.removeZeroSumSublists(head);
        assert 1 == result.val;
        assert 2 == result.next.val;
        assert 4 == result.next.next.val;
    }

    @Test
    @DisplayName("head = [1,2,3,-3,-2]")
    void removeZeroSumSublists_Test3() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(-3);
        head.next.next.next.next = new ListNode(-2);
        P1171 solution = new P1171();
        ListNode result = solution.removeZeroSumSublists(head);
        assert 1 == result.val;
    }
}
