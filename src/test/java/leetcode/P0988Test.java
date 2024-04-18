package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0988Test {

    @Test
    @DisplayName("root = [0,1,2,3,4,3,4]")
    void test1() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(4);
        String expected = "dba";
        assert expected.equals(new P0988().smallestFromLeaf(root));
    }
}
