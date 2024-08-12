package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0226Test {

    @Test
    @DisplayName("root = [1,2,3,4,5,6,7]")
    void test1() {
        TreeNode root =
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(4),
                    new TreeNode(5)
                ),
                new TreeNode(3,
                    new TreeNode(6),
                    new TreeNode(7)
                )
            );
        TreeNode expected =
            new TreeNode(1,
                new TreeNode(3,
                    new TreeNode(7),
                    new TreeNode(6)
                ),
                new TreeNode(2,
                    new TreeNode(5),
                    new TreeNode(4)
                )
            );
        TreeNode actual = new P0226().invertTree(root);
        TreeNode.assertTree(expected, actual);
    }
}
