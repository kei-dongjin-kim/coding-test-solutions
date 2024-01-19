package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P0021Test {

    @Test
    @DisplayName("list1 = [1,2,4], list2 = [1,3,4]")
    void mergeTwoLists1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        P0021 p0021 = new P0021();
        ListNode actual = p0021.mergeTwoLists(list1, list2);
        ////// print //////
        ListNode actual2 = p0021.mergeTwoLists(list1, list2);
        while (actual2 != null) {
            System.out.println(">>>" + actual2.val);
            actual2 = actual2.next;
        }
        //////
        assertEquals(expected, actual);

    }
}
