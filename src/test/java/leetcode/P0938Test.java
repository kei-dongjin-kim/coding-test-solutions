package leetcode;

import org.junit.jupiter.api.Test;

public class P0938Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    root.right.right = new TreeNode(7);
    int low = 3;
    int high = 5;
    int expected = 12;
    P0938 solution = new P0938();
    int actual = solution.rangeSumBST(root, low, high);
    assert expected == actual;
  }
}
