package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1325Test {

    @Test
    @DisplayName("root = [1,2,3,2,null,2,4], target = 2")
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(4);
        int target = 2;
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(3);
        expected.right.right = new TreeNode(4);
        TreeNode actual = new P1325().removeLeafNodes(root, target);
        TreeNode.assertTree(actual, expected);
    }
}
