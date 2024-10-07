package leetcode;

import org.junit.jupiter.api.Test;

public class P0110Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    boolean expected = true;
    P0110 solution = new P0110();
    boolean actual = solution.isBalanced(root);
    assert expected == actual;
  }

  @Test
  void test2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(1);
    root.left.left.left = new TreeNode(1);
    boolean expected = false;
    P0110 solution = new P0110();
    boolean actual = solution.isBalanced(root);
    assert expected == actual;
  }
}
