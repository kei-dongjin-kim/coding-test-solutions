package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0543Test {

    @Test
    @DisplayName("root = [1,2,3,4,5]")
    void diameterOfBinaryTree_Test1() {
        P0543.TreeNode root = new P0543.TreeNode(
                1,
                new P0543.TreeNode(
                        2,
                        new P0543.TreeNode(4),
                        new P0543.TreeNode(5)
                ),
                new P0543.TreeNode(3)
        );
        int expected = 3;
        int actual = new P0543().diameterOfBinaryTree(root);
        assert expected == actual;
    }
}
