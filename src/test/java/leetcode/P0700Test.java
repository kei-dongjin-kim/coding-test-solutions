package leetcode;

import org.junit.jupiter.api.Test;

public class P0700Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    TreeNode expected  = new TreeNode(6);
    expected.left = new TreeNode(5);
    expected.right = new TreeNode(7);
    TreeNode actual = new P0700().searchBST(root, 6);
    TreeNode.assertTree(expected, actual);
  }
}
