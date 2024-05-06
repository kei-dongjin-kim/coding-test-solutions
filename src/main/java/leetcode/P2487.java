package leetcode;

import java.util.Stack;

public class P2487 {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while (curr != null) {
            stack.push(curr);
            curr = curr.next;
        }

        curr = stack.pop();
        int max = curr.val;
        ListNode result = new ListNode(max);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            if (curr.val < max) {
                continue;
            } else {
                ListNode newNode = new ListNode(curr.val);
                newNode.next = result;
                result = newNode;
                max = curr.val;
            }
        }
        return result;
    }
}
