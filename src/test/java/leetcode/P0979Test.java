package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0979Test {

    @Test
    @DisplayName("root = [3,0,0]")
    void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        int expected = 2;
        int actual = new P0979().distributeCoins(root);
        assert actual == expected;
    }
}
