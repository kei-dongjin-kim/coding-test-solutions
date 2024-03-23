package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0234Test {

    @Test
    @DisplayName("head = [1,2,2,1]")
    void isPalindrome_Test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        P0234 solution = new P0234();
        boolean expected = true;
        boolean actual = solution.isPalindrome(head);
        assert expected == actual;
    }
}
