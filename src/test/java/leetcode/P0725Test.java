package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0725Test {

    @Test
    @DisplayName("head = [1,2,3,4,5,6,7,8,9,10], k = 4")
    void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9, new ListNode(10))))))))));
        int k = 4;
        ListNode[] expected = new ListNode[] {
            new ListNode(1, new ListNode(2, new ListNode(3))),
            new ListNode(4, new ListNode(5, new ListNode(6))),
            new ListNode(7, new ListNode(8)),
            new ListNode(9, new ListNode(10))
        };
        ListNode[] result = new P0725().splitListToParts(head, k);
        for (int i=0 ; i<k ; i++) {
            ListNode e = expected[i];
            ListNode r = result[i];
            while (e != null) {
                assert e.val == r.val;
                e = e.next;
                r = r.next;
            }
        }
    }
}
