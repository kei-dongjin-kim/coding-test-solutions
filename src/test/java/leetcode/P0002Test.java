package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import leetcode.P0002.ListNode;

public class P0002Test {

    @Test
    @DisplayName("2 -> 4 -> 3, 5 -> 6 -> 6")
    void addTwoNumbers1() {
        P0002 p0002 = new P0002();
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(6)));
        ListNode result = p0002.addTwoNumbers(l1, l2);
        assert result.val == 7;
        assert result.next.val == 0;
        assert result.next.next.val == 0;
        assert result.next.next.next.val == 1;
    }
}
