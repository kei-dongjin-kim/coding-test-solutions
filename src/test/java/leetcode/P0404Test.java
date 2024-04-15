package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0404Test {

    @Test
    @DisplayName("root = [3,9,20,null,null,15,7]")
    void test1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assert new P0404().sumOfLeftLeaves(root) == 24;
    }
}
