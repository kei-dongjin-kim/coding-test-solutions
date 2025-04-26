package leetcode;

import org.junit.jupiter.api.Test;

public class P1290Test {

    @Test
    void test1() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(0);
        int expected = 12;
        P1290 solution = new P1290();
        int actual = solution.getDecimalValue(head);
        assert expected == actual;
    }
}
