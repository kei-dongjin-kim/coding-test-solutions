package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1669Test {

    @Test
    @DisplayName("list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]")
    void mergeInBetween_Test1() {
        ListNode list1 = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5))))));
        ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002)));
        ListNode expected = new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(5)))))));
        ListNode actual = new P1669().mergeInBetween(list1, 3, 4, list2);
        while (expected != null) {
            assert expected.val == actual.val;
            expected = expected.next;
            actual = actual.next;
        }
    }
}
