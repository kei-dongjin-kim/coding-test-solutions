package leetcode;

import org.junit.jupiter.api.Test;

public class P0222Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(1);
    P0222 solution = new P0222();
    int expected = 4;
    int actual = solution.countNodes(root);
    assert expected == actual;
  }
}
