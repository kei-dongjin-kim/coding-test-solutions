package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0129Test {

    @Test
    @DisplayName("root = [4,9,0,5,1]")
    void test1() {
        TreeNode root = new TreeNode(4, new TreeNode(9, new TreeNode(5), new TreeNode(1)), new TreeNode(0));
        int expected = 1026;
        assert expected == new P0129().sumNumbers(root);
    }
}
