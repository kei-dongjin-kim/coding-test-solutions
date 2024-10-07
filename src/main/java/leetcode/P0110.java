package leetcode;

public class P0110 {
  public boolean isBalanced(TreeNode root) {
    return dfs(root) != -1;
  }
  private int dfs(TreeNode node){
    if (node == null)
      return 0;
    int left = dfs(node.left);
    int right = dfs(node.right);
    if (Math.abs(left - right) > 1 || left == -1 || right == -1){
      return -1;
    } else {
      return Math.max(left, right) + 1;
    }
  }
}
