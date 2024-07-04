package leetcode;

public class P2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        node1.next = node2;
        int sum = 0;
        while (head.next != null) {
            sum += head.val;
            if (head.next.val == 0) {
                node2.next = new ListNode(sum);
                node2 = node2.next;
                sum = 0;
            }
            head = head.next;
        }
        // node1.next is 0
        return node1.next.next;
    }
}
