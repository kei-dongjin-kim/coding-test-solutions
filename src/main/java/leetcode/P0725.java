package leetcode;

public class P0725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int quotient = count / k;
        int remainder = count % k;

        curr = head;
        for (int i=0 ; i<k ; i++) {
            ListNode dummy = new ListNode(0);
            ListNode write = dummy;
            for (int j=0 ; j<quotient ; j++) {
                write.next = curr;
                write = write.next;
                curr = curr.next;
            }
            // remainder is the number of nodes that should have one more node
            if (remainder > 0) {
                write.next = curr;
                write = write.next;
                curr = curr.next;
                remainder--;
            }
            write.next = null;
            result[i] = dummy.next;
        }

        return result;
    }
}
