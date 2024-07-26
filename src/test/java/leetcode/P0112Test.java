package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0112Test {

    @Test
    @DisplayName("root = [1,2,3,4], targetSum = 7")
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        int targetSum = 7;
        boolean actual = new P0112().hasPathSum(root, targetSum);
        boolean expected = true;
        assert expected == actual;
    }
}
