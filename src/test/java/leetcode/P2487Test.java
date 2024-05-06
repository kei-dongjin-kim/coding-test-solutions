package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2487Test {

    @Test
    @DisplayName("head = [5,2,13,3,8]")
    void test1() {
        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(13);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(8);
        ListNode expected = new ListNode(13);
        expected.next = new ListNode(8);
        assert new P2487().removeNodes(head).equals(expected);
    }
}
