package leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class P0100Test {

    @Test
    @DisplayName("p = [1,2,3], q = [1,2,3]")
    void isSameTree_Test1() {
        P0100.TreeNode p = new P0100.TreeNode(1, new P0100.TreeNode(2), new P0100.TreeNode(3));
        P0100.TreeNode q = new P0100.TreeNode(1, new P0100.TreeNode(2), new P0100.TreeNode(3));
        assert new P0100().isSameTree(p, q);
    }
}
