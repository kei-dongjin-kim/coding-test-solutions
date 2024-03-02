package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P1457Test {

    @Test
    @DisplayName("[2,3,1,3,1,null,1]")
    void P1457Test1() {
        P1457.TreeNode root = new P1457.TreeNode(2);
        root.left = new P1457.TreeNode(3);
        root.right = new P1457.TreeNode(1);
        root.left.left = new P1457.TreeNode(3);
        root.left.right = new P1457.TreeNode(1);
        root.right.right = new P1457.TreeNode(2);
        P1457 solution = new P1457();
        assert(2 == solution.pseudoPalindromicPaths(root));
    }

    @Test
    @DisplayName("[2,1,1,1,3,null,null,null,null,null,1]")
    void P1457Test2() {
        P1457.TreeNode root = new P1457.TreeNode(2);
        root.left = new P1457.TreeNode(1);
        root.right = new P1457.TreeNode(1);
        root.left.left = new P1457.TreeNode(1);
        root.left.right = new P1457.TreeNode(3);
        root.right = new P1457.TreeNode(1);
        P1457 solution = new P1457();
        assert(1 == solution.pseudoPalindromicPaths(root));
    }
}
