package leetcode;

// import java.util.ArrayList;

public class P0876 {
    // Definition for singly-linked list.

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

//        ArrayList<ListNode> array = new ArrayList<>();
//        while (head != null) {
//            array.add(head);
//            head = head.next;
//        }
//        return array.get(array.size()/2);
    }
}