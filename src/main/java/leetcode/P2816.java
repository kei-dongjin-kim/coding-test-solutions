package leetcode;

import java.util.Stack;

public class P2816 {
    public ListNode doubleIt(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode next = null;
        int up = 0;
        int dn = 0;
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            dn = ((tmp * 2) % 10) + up;
            up = (tmp * 2) / 10;
            next = new ListNode(dn, next);
        }
        if (up != 0) next = new ListNode(up, next);
        return next;
    }
}
