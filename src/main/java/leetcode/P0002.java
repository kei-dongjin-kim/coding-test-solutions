package leetcode;

import java.util.ArrayList;

public class P0002 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode temp = result;
        int v1 = 0;
        int v2 = 0;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 == null) v1 = 0;
            else v1 = l1.val;
            if (l2 == null) v2 = 0;
            else v2 = l2.val;

            temp.next = new ListNode((v1 + v2 + carry)% 10);
            temp = temp.next;
            carry = (v1 + v2 + carry)/10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return result.next;
    }
}
