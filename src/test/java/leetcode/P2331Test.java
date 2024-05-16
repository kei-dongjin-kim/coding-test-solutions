package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P2331Test {

    @Test
    @DisplayName("root = [2,1,3,null,null,0,1]")
    void test1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        boolean expected = true;
        boolean actual = new P2331().evaluateTree(root);
        assert expected == actual;
    }
}
