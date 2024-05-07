package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2816Test {

    @Test
    @DisplayName("head = [9,9]")
    void test1() {
        ListNode head = new ListNode(9, new ListNode(9));
        ListNode expected = new ListNode(1, new ListNode(9, new ListNode(8)));
        assert new P2816().doubleIt(head).equals(expected);
    }
}
