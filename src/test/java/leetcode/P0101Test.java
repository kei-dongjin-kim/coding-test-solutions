package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0101Test {

    @Test
    @DisplayName("root = [1,2,2,3,4,4,3]")
    void isSymmetric_Test1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(4)
                ),
                new TreeNode(
                        2,
                        new TreeNode(4),
                        new TreeNode(3)
                )
        );
        boolean expected = true;
        assert expected == new P0101().isSymmetric(root);
    }

    @Test
    @DisplayName("root = [1,2,2,null,3,null,3]")
    void isSymmetric_Test2() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        null,
                        new TreeNode(3)
                ),
                new TreeNode(
                        2,
                        null,
                        new TreeNode(3)
                )
        );
        boolean expected = false;
        assert expected == new P0101().isSymmetric(root);
    }
}
