package leetcode;

public class P1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode rest = list1;
        for (int i=0 ; i<a-1 ; i++) {
            curr = curr.next;
        }
        for (int i=0 ; i<b+1 ; i++) {
            rest = rest.next;
        }
        curr.next = list2;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = rest;
        return list1;
    }
}
