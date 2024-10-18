package leetcode;

import java.util.List;
import java.util.ArrayList;

public class P0257 {
  public List<String> binaryTreePaths(TreeNode root) {
    if (root == null) {
      return new ArrayList<String>();
    }
    List<String> result = new ArrayList<>();
    if (root.left == null && root.right == null) {
      result.add(String.valueOf(root.val));
    } else {
      List<String> left = binaryTreePaths(root.left);
      List<String> right = binaryTreePaths(root.right);
      for (String s : left) {
        result.add(root.val + "->" + s);
      }
      for (String s : right) {
        result.add(root.val + "->" + s);
      }
    }
    return result;
  }
}
