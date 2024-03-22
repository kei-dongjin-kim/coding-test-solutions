package leetcode;

public class P0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode next = null;

        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;

        // ListNode tmp = null;
        // while (head != null) {
        //     tmp = new ListNode(head.val, tmp);
        //     if (head.next == null) {
        //         return tmp;
        //     } else {
        //         head = head.next;
        //     }
        // }
        // return tmp;
    }
}
