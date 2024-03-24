package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        List<ListNode> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current);
            current = current.next;
        }

        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            list.get(left).next = list.get(right);
            left++;
            if (left == right) {
                list.get(left).next = null;
                break;
            }
            list.get(right).next = list.get(left);
            right--;
            if (left == right) {
                list.get(right).next = null;
                break;
            }
        }

    }
}
