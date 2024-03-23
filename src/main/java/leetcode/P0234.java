package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class P0234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        System.out.println("list = " + list.toString());
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            if (!Objects.equals(list.get(left), list.get(right))) return false;
            left++;
            right--;
        }
        return true;
    }
}
