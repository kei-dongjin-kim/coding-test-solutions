package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0083Test {

    @Test
    @DisplayName("head = [1,1,2,2,3,3]")
    void test1() {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(3))))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode actual = new P0083().deleteDuplicates(head);
        assert expected.equals(actual);
    }
}
