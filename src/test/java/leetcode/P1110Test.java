package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class P1110Test {

    @Test
    @DisplayName("root = [1,2,3,4,5,6,7], to_delete = [2,7]")
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        int[] to_delete = new int[]{2, 7};
        List<TreeNode> expected = new ArrayList<>();
        expected.add(new TreeNode(4));
        expected.add(new TreeNode(5));
        expected.add(new TreeNode(1, null, new TreeNode(3, new TreeNode(6), null)));
        List<TreeNode> actual = new P1110().delNodes(root, to_delete);

        for (int i=0; i<expected.size(); i++) {
            TreeNode.assertTree(expected.get(i), actual.get(i));
        }
    }
}
