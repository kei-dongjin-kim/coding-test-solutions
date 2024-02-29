package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1609Test {

    @Test
    @DisplayName("root = [1,10,4,3,null,7,9,12,8,6,null,null,2]")
    void isEvenOddTree_Test1() {
        P1609.TreeNode root = new P1609.TreeNode(1);
        root.left = new P1609.TreeNode(10);
        root.right = new P1609.TreeNode(4);
        root.left.left = new P1609.TreeNode(3);
        root.right.left = new P1609.TreeNode(7);
        root.right.right = new P1609.TreeNode(9);
        root.left.left.left = new P1609.TreeNode(12);
        root.left.left.right = new P1609.TreeNode(8);
        root.right.left.left = new P1609.TreeNode(6);
        root.right.right.right = new P1609.TreeNode(2);
        P1609 p1609 = new P1609();
        assert p1609.isEvenOddTree(root);
    }
}
