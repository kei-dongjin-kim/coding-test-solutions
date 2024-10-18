package leetcode;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

public class P0257Test {
  
  @Test
  void test1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    P0257 solution = new P0257();
    List<String> expected = new ArrayList<>();
    expected.add("1->2->4");
    expected.add("1->2->5");
    expected.add("1->3");
    List<String> actual = solution.binaryTreePaths(root);
    for (int i=0 ; i<expected.size() ; i++) {
      assert expected.get(i).equals(actual.get(i));
    }

  }
}
