package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1038Test {

    @Test
    void test1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        TreeNode expected = new TreeNode(22);
        expected.left = new TreeNode(27);
        expected.right = new TreeNode(13);
        expected.left.left = new TreeNode(28);
        expected.left.right = new TreeNode(25);
        expected.right.left = new TreeNode(18);
        expected.right.right = new TreeNode(7);

        P1038 solution = new P1038();
        TreeNode actual = solution.bstToGst(root);
        TreeNode.assertTree(expected, actual);
    }
}
