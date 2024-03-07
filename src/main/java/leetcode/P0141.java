package leetcode;

public class P0141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        // The floyd's Totoise and hare algorithm
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
