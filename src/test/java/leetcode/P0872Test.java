package leetcode;

import org.junit.jupiter.api.Test;

public class P0872Test {
  
  @Test
  void test1() {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    root1.left.left = new TreeNode(4);
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(4);
    root2.right = new TreeNode(2);
    root2.right.right = new TreeNode(3);
    boolean expected = true;
    P0872 solution = new P0872();
    boolean actual = solution.leafSimilar(root1, root2);
    assert expected == actual;
  }
}
