package leetcode;

import java.util.ArrayList;

public class P0876 {
    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();

        while (head != null) {
            array.add(head);
            head = head.next;
        }

        return array.get(array.size()/2);
    }
}