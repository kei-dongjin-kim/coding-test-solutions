package leetcode;

import org.junit.jupiter.api.Test;

public class P0965Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(1);
    root.right = new TreeNode(1);
    boolean expected = true;
    P0965 solution = new P0965();
    boolean actual = solution.isUnivalTree(root);
    assert expected == actual;
  }
}
