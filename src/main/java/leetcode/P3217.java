package leetcode;

import java.util.HashSet;
import java.util.Set;

public class P3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }

        ListNode result = new ListNode(-1, head);
        ListNode current = result;
        while (current.next != null) {
            if (numSet.contains(current.next.val)) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return result.next;
    }
}
