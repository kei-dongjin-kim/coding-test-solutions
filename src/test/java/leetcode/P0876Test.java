package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import leetcode.P0876.ListNode;

public class P0876Test {

    @Test
    @DisplayName("1->2->3->4->5->NULL")
    public void middleNodeTest() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        P0876 solution = new P0876();
        assertEquals(node3, solution.middleNode(node1));
    }
}
