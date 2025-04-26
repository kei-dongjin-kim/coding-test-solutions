package leetcode;

public class P1290 {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        int result = 0;
        while (head != null) {
            sb.append(head.val);
            head = head.next;
        }
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                result += Math.pow(2, i);
            }
        }
        return result;
    }
}
