package leetcode;

public class P0965 {
  public boolean isUnivalTree(TreeNode root) {
    boolean left = false;
    boolean right = false;
    if (root.left == null) {
      left = true;
    } else {
      if (
        root.val == root.left.val &&
        isUnivalTree(root.left)
      ) {
        left = true;
      } else {
        left = false;
      }
    }
    if (root.right == null) {
      right = true;
    } else {
      if (
        root.val == root.right.val &&
        isUnivalTree(root.right)
      ) {
        right = true;
      } else {
        right = false;
      }
    }
    return left && right;
  }
}
