package leetcode;

import org.junit.jupiter.api.Test;

public class P1379Test {

    @Test
    void test1() {
        TreeNode original = new TreeNode(1);
        original.left = new TreeNode(2);
        original.right = new TreeNode(3);
        original.left.left = new TreeNode(4);
        original.left.right = new TreeNode(5);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(7);
        TreeNode cloned = new TreeNode(1);
        cloned.left = new TreeNode(2);
        cloned.right = new TreeNode(3);
        cloned.left.left = new TreeNode(4);
        cloned.left.right = new TreeNode(5);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(7);
        TreeNode target = new TreeNode(3);
        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(6);
        expected.right = new TreeNode(7);
        P1379 solution = new P1379();
        TreeNode actual = solution.getTargetCopy(original, cloned, target);
        TreeNode.assertTree(expected, actual);
    }
}
