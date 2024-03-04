package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null && n == 1) return null;
        List<ListNode> list = new ArrayList<>();
        ListNode copied = head;
        while (copied != null) {
            list.add(copied);
            copied = copied.next;
        }
        if (list.size() == n) {
            return head.next;
        } else {
            ListNode target = list.get(list.size() - n - 1);
            if (n == 1) {
                target.next = null;
            } else {
                target.next = list.get(list.size() - n + 1);
            }
        }
        return head;
    }
}
