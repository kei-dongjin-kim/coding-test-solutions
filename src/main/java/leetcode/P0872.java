package leetcode;

import java.util.ArrayList;
import java.util.List;

public class P0872 {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    getLeaf(list1, root1);
    getLeaf(list2, root2);
    if (list1.size() != list2.size()) {
      return false;
    }
    for (int i=0 ; i<list1.size() ; i++) {
      if (!list1.get(i).equals(list2.get(i))) {
        return false;
      }
    }
    return true;
  }
  private List<Integer> getLeaf(List<Integer> list, TreeNode root) {
    if (root == null) {
      return null;
    }
    if (root.left == null && root.right == null) {
      list.add(root.val);
      return list;
    } else {
      getLeaf(list, root.left);
      getLeaf(list, root.right);
    }
    return list;
  }
}
