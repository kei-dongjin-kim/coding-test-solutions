package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0108Test {

    @Test
    @DisplayName("nums = [-3,-2,-1,0,1,2,3]")
    void test1() {
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        TreeNode expected = new TreeNode(0,
                new TreeNode(-2,
                        new TreeNode(-3),
                        new TreeNode(-1)),
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)));
        TreeNode actual = new P0108().sortedArrayToBST(nums);
        TreeNode.assertTree(expected, actual);
    }
}
