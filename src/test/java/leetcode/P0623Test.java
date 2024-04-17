package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0623Test {

    @Test
    @DisplayName("root = [4,2,6,3,1,5], val = 1, depth = 2")
    void test1() {
        TreeNode root =
                new TreeNode(
                    4,
                    new TreeNode(
                        2,
                        new TreeNode(3),
                        new TreeNode(1)
                    ),
                    new TreeNode(
                        6,
                        new TreeNode(5),
                        null
                    )
                );
        int val = 1;
        int depth = 2;
        TreeNode expected =
                new TreeNode(
                    4,
                    new TreeNode(
                        1,
                        new TreeNode(
                            2,
                            new TreeNode(3),
                            new TreeNode(1)
                        ),
                        null
                    ),
                    new TreeNode(
                        1,
                        null,
                        new TreeNode(
                            6,
                            new TreeNode(5),
                            null
                        )
                    )
                );
        P0623 solution = new P0623();
        TreeNode actual = solution.addOneRow(root, val, depth);
        TreeNode.assertTree(expected, actual);
    }
}
