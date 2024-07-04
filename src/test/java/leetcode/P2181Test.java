package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2181Test {

    @Test
    @DisplayName("head = [0,1,1,0,1,1,1,0]")
    void test1() {
        ListNode head = new ListNode(0, new ListNode(1, new ListNode(1, new ListNode(0, new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(0))))))));
        ListNode expected = new ListNode(2, new ListNode(3));
        ListNode actual = new P2181().mergeNodes(head);
        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
