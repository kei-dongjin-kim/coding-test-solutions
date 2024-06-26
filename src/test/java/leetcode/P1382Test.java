package leetcode;

import org.junit.jupiter.api.Test;

public class P1382Test {

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        root.right.right.right.right = new TreeNode(5);
        root.right.right.right.right.right = new TreeNode(6);
        root.right.right.right.right.right.right = new TreeNode(7);

        TreeNode expected = new TreeNode(4);
        expected.left = new TreeNode(2);
        expected.left.left = new TreeNode(1);
        expected.left.right = new TreeNode(3);
        expected.right = new TreeNode(6);
        expected.right.left = new TreeNode(5);
        expected.right.right = new TreeNode(7);

        P1382 solution = new P1382();
        TreeNode actual = solution.balanceBST(root);

        TreeNode.assertTree(expected, actual);
    }
}
