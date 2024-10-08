package leetcode;

import org.junit.jupiter.api.Test;

public class P0111Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    int expected = 2;
    P0111 solution = new P0111();
    int actual = solution.minDepth(root);
    assert expected == actual;
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.left.left = new TreeNode(1);
    root.left.left.left.left = new TreeNode(1);
    root.left.left.left.left.left = new TreeNode(1);
    int expected = 6;
    P0111 solution = new P0111();
    int actual = solution.minDepth(root);
    assert expected == actual;
  }
}
