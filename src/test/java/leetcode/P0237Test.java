package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0237Test {

    @Test
    @DisplayName("node = [4,5,1,9], node = 5")
    void test1() {
        ListNode node = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(9))));
        new P0237().deleteNode(node);
        assert node.val == 5;
        assert node.next.val == 1;
        assert node.next.next.val == 9;
        assert node.next.next.next == null;
    }
}
